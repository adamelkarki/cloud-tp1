package com.tp1.el_karki_ben_fraj.controller;

import com.tp1.el_karki_ben_fraj.entities.CarsDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Cars {


    @GetMapping("/cars/get")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    private List<CarsDTO> listOfCars() {
        List<CarsDTO> listOfCarsDTO = new ArrayList<>();
        listOfCarsDTO.add(new CarsDTO(100,  "Ferrarri", "11AA22"));
        listOfCarsDTO.add(new CarsDTO(100,  "Lamborghini", "11AA33"));
        listOfCarsDTO.add(new CarsDTO(100,  "McLaren", "11AA44"));
        return listOfCarsDTO;
    }

    @GetMapping("/cars/get/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CarsDTO getCarFromPlateNumber(
            @PathVariable String plateNumber
    ) throws Exception {
        CarsDTO carDTO = new CarsDTO();
        carDTO.setPlateNumber(plateNumber);
        carDTO.setBrand("test");
        carDTO.setPrice(0);
        return carDTO;
    }

    @PutMapping("cars/update/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public CarsDTO rentOrGetBack(
            @PathVariable String plateNumber,
            @RequestParam(value = "rent", required = true) boolean rent
    ) throws Exception {
        CarsDTO carDTO = new CarsDTO();
        carDTO.setPlateNumber(plateNumber);
        carDTO.setBrand("test");
        carDTO.setPrice(0);
        carDTO.setRent(true);
        return carDTO;
    }

    @PutMapping("cars/update/{plateNumber}-dates")
    @ResponseStatus(HttpStatus.OK)
    public CarsDTO rentOrGetBackWithDates(
            @PathVariable String plateNumber,
            @RequestParam(value = "rent", required = true) boolean rent,
            @RequestBody String date
    ) throws Exception {
        CarsDTO carDTO = new CarsDTO();
        carDTO.setPlateNumber(plateNumber);
        carDTO.setBrand("test");
        carDTO.setPrice(0);
        carDTO.setRent(true);
        carDTO.setDateOfRent(date);
        return carDTO;
    }
}
