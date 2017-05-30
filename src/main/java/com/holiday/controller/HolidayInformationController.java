package com.holiday.controller;

import com.holiday.model.HolidayApiRequest;
import com.holiday.model.HolidayApiResponse;
import com.holiday.service.HolidayInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolidayInformationController {

    private HolidayInformationService holidayInformationService;

    @Autowired
    public HolidayInformationController(HolidayInformationService holidayInformationService) {
        this.holidayInformationService = holidayInformationService;
    }

    @GetMapping("/getHolidays/{firstCountryCode}/{secondCountryCode}/{date}")
    public HolidayApiResponse getHolidays(HolidayApiRequest holidayApiRequest) {
        return holidayInformationService.getHolidays(holidayApiRequest);
    }
}
