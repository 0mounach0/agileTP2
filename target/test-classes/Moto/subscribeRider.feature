@tag
  Feature: subscribe a rider
    Scenario Outline: subscribe a non existing rider (one moto only)
      Given a rider
      And a rider the rider fullname is : <fullname>
      When set <moto1> to rider
      Then the rider is subscribed and <moto1> is registered

      Examples:
      |    Rider fullname   |    Moto Brand   |    Moto Model   |
      |    "MASDOUA Manil"  |     "YAMAHA"    |     "Z750"      |