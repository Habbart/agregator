package com.example.agregator.controllers;


import com.example.agregator.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private Service service;

    /**
     *  метод используется для получения прайса по универсальным координатам.
     */
    @GetMapping("/prices")
    public void requestPrices(@RequestParam(value = "user_id") Integer userId,
                              @RequestParam(value = "start_place_point") String startLocation,
                              @RequestParam(value = "finish_place_point") String endLocation,
                              @RequestParam(value = "currency", required = false) Currency currency,
                              @RequestParam(value = "lang", required = false) Language language){
        service.getPrices(userId, startLocation, endLocation, currency, language);
    }

    /**
     * метод проверки времени подачи автомобиля,
     * возможно ли уложиться в указанные временные
     * рамки между выездом из точки назначения и
     * отправлением поезда или вылетом самолета.
     */
    @PostMapping("/orders/check-time")
    public void checkTime(){}

    /**
     * метод получения рекомендуемого времени подачи автомобиля к месту отправления,
     * по времени отправления поезда/самолета.
     */
    @GetMapping("/orders/recomended-time")
    public void getRecommendedTime(){}

    /**
     * метод создания поездки.
     */
    @PostMapping("/orders")
    public void createOrder(){}

    /**
     * метод получения ссылки на оплату заказа.
     */
    @GetMapping("/orders/pay-url")
    public void getUrlForPayment(){}

    /**
     * метод подтверждения статуса оплаты заказа.
     */
    @PostMapping("/orders/approve/{transaction}")
    public void getConfirmationOfPayment(){}

    /**
     * метод изменения данных поездки.
     * дополнительные заезды/изменение маршрутов;
     * дополнительное ожидание;
     * проезд по платной дороге.
     */
    @PutMapping("/orders/trips")
    public void putAdditionalOptionsForOrder(){}

    /**
     * метод поиска поездок.
     * дополнительные заезды/изменение маршрутов;
     * дополнительное ожидание;
     * проезд по платной дороге.
     */

    @GetMapping("/orders/trips")
    public void findOrders(){}

    /**
     * получение токена авторизации.
     * Необходим для методов требующих авторизацию.
     */
    @PostMapping("/auth/login")
    public void getTokenOfAuthorization(){}

    /**
     * метод получения прайса по IATA кодам аэропортов.
     */
    @GetMapping("/prices/iata")
    public void getAirportPrice(){}

    /**
     * метод получения пути к документам по заказу
     */
    @GetMapping("/documents")
    public void getDocuments(){}

    /**
     * Метод получения пути к документам по заказу и отправки их на Email.
     */
    @PostMapping("/documents/send")
    public void sendDocsToMail(){}

    /**
     * етод отмены поездки.
     */
    @PostMapping("/trips/cancel")
    public void cancelTrip() {}



}
