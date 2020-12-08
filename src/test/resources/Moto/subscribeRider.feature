@tag
  Feature: subscribe a rider
    Scenario Outline: subscribe a non existing rider (one moto only)
      Given a rider
      And a rider the rider fullname is : <fullname>
      When set moto to rider where <brand> and <model>
      Then the rider is subscribed with moto

      Examples:
      |    fullname         |    brand        |    model        |
      |    "MASDOUA Manil"  |     "YAMAHA"    |     "Z750"      |