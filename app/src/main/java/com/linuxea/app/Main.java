package com.linuxea.app;

import com.linuxea.api.WealthManagerProvider;
import java.time.LocalDate;
import java.util.ServiceLoader;

public class Main {

  public static void main(String[] args) {

    // remember add impl lib into app classpath

    ServiceLoader<WealthManagerProvider> wealthManagerProviders = ServiceLoader.load(
        WealthManagerProvider.class);

    for (WealthManagerProvider provider : wealthManagerProviders) {
      String wealth = provider.get().getWealth(LocalDate.now());
      System.out.println(wealth);
    }

  }

}
