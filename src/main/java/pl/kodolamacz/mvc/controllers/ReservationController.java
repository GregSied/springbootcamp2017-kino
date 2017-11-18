package pl.kodolamacz.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kodolamacz.spring.dao.repository.ReservationDao;
import pl.kodolamacz.spring.dao.repository.UserDao;

/**
 * Created by acacko on 18.11.17
 */
@Controller
@RequestMapping(value = "/reservations")
public class ReservationController {

  @Autowired
  private ReservationDao reservationDao;

  @Autowired
  private UserDao userDao;

  @RequestMapping(method = RequestMethod.GET)
  public void get(Model model) {
    System.out.println("TUTAJ PRACA DOMOWA");
  }

  // przykład adresu: http://localhost:8080/kino/reservations/byUser?userId=1
  @RequestMapping(value = "/byUser", method = RequestMethod.GET)
  public String getReservationsByUserId(Model model, @RequestParam("userId") Long userId) {
    // jeśli paramName oraz nazwa zmiennej się pokrywają.
    // Można pominąć deklarację nazwy zmiennej w @RequestParam
    model.addAttribute("userReservations", reservationDao.findByUserId(userId));
    model.addAttribute("user", userDao.findOne(userId));
    return "reservations";
  }
}
