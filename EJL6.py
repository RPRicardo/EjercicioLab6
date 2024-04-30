class Hexagono:
   def __init__(self,lado,apotema,color):
      self.__lado=lado
      self.__apotema=apotema
      self.__color=color

   def area(self):
      return  ((self.__lado*6)*self.__apotema)/2
   def perimetro(self):
      return self.__lado*6
   def color(self):
      return self.__color
   
hexa= Hexagono(2,3,"rojo")   
print(hexa.area())
print(hexa.perimetro())
print(hexa.color())

class Rombo:
   def __init__(self,digmayor,digmenor,color, lado):
      self.__digmayor=digmayor
      self.__digmenor=digmenor
      self.__color=color
      self.__lado=lado

   def area(self):
      return  (self.__digmayor*self.__digmenor)/2
   def perimetro(self):
      return self.__lado*4
   def color(self):
      return self.__color
   
rombo= Rombo(3,2,"rojo",2)   
print(rombo.area())
print(rombo.perimetro())
print(rombo.color())

class Trapecio:
   def __init__(self,basema,baseme,altura,diagonales,color):
      self.__basema=basema
      self.__baseme=baseme
      self.__color=color
      self.__altura=altura
      self.__diagonales=diagonales

   def area(self):
      return  (self.__basema+self.__baseme)/2 * self.__altura
   def perimetro(self):
      return  self.__diagonales *2 + self.__basema+self.__baseme
   def color(self):
      return self.__color

trape= Trapecio(3,2,3,4,"rojo")   
print(trape.area())
print(trape.perimetro())
print(trape.color())


