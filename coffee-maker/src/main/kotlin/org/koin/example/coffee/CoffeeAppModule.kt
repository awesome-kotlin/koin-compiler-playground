package org.koin.example.coffee

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import org.koin.dsl.module
import org.koin.example.coffee.pump.Pump

@Module
@ComponentScan
class CoffeeAppModule