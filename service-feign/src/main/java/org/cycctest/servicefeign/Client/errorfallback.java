package org.cycctest.servicefeign.Client;

import org.springframework.stereotype.Component;

@Component
public class errorfallback implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry, "+name+", there is an error!";
    }
}
