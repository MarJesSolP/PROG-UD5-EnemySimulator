---
###
Principio de la segregacion 
---
Este proyecto cumple con el principio de segregación de interfaces al 
diseñar interfaces específicas que satisfacen las necesidades de las clases 
que las implementan. Las interfaces Daño y Combate están diseñadas para ser 
implementadas por las clases Personaje, MobHostil y MobPacifico, evitando así 
la dependencia de métodos no utilizados y logrando una mayor cohesión y flexibilidad 
en el código. 

La interfaz 'Daño' define el método 'recibirAtaque' que se utiliza en la 
clase 'MobPacifico'. Solo mobs pacificos ncesitan implementar este 
método, ya que son los únicos que reciben daño sin la posibilidad 
de contraatacar.
La interfaz 'Combate', por otro lado, extiende la interfaz 'Daño' 
y define el método 'atacar()'. Esta interfaz se 
implementa en las clases 'Personaje' y 'MobHostil', 
ya que tanto el personaje como los mobs hostiles tienen la 
capacidad de atacar y recibir daño.

Utilizando las interfaces segregadas, se evita la dependencia de
métodos que no se utilizan en las clases y se logra una mayor
cohesión, esto a su permite que el ptoyecto se pueda extender y
agregar así nuevos mobs o personajes sin que se vea afectada
la interfaz existente. 