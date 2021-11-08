package ru.ibs.enginesimple.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ibs.enginesimple.exception.EngineNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(EngineNotFoundException.class)
    public String handleEngineNotFound(Model model, EngineNotFoundException e) {
        model.addAttribute("message", e.getMessage());
        return "engine-not-found";
    }
}
