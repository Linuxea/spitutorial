package com.linuxea.impl;

import com.linuxea.api.WealthManager;
import com.linuxea.api.WealthManagerProvider;

public class MockWealthManagerProvider implements WealthManagerProvider {

  @Override
  public WealthManager get() {
    return date -> "sunny";
  }
}
