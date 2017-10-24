import numpy as np
import matplotlib.pyplot as plt

def plot_line(x, y):
	plt.plot(np.unique(x), np.poly1d(np.polyfit(x, y, 1))(np.unique(x)))

numbers = [1000003, 2000003, 4000037, 8000009, 16000057, 32000011, 64000031, 128000003, 256000001, 512000009, 1024000009,2048000011]


partie1_pire_cas = 6 * np.array(numbers) - 6
partie1_millieur_cas = [6,6,6,6,6,6,6,6,6,6,6,6]

plt.title('Pire cas VS Millieur cas')
line1, = plt.plot(numbers, partie1_millieur_cas, 'go')
line2, = plt.plot(numbers, partie1_pire_cas, 'ro')
plot_line(numbers, partie1_millieur_cas)
plot_line(numbers, partie1_pire_cas)
plt.figlegend((line1, line2), ('millieur', 'pire'), 'upper left')
plt.xlabel('nombre')
plt.ylabel('temps')
plt.savefig('Pire cas VS Millieur cas.png')
plt.clf()
#plt.show()


partie1 = [0.017629, 0.020659, 0.040898, 0.081364, 0.162702, 0.327618, 0.653843, 1.319670, 2.627742, 5.220003, 10.406829, 20.833496]

plt.title('Algorithme1')
plt.plot(numbers, partie1, 'bo')
plot_line(numbers, partie1)
plt.xlabel('nombre')
plt.ylabel('temps')
plt.savefig('Algorithme1')
#plt.show()


partie2 = [0.012463, 0.014740, 0.029145, 0.059281, 0.118130, 0.235605, 0.472318, 0.944552, 1.864201, 3.732513, 7.563557, 15.078291]

plt.title('Algorithme1 VS Algorithme2')
plt.axis([1000003, 2048000011, 0, 25])
line1, = plt.plot(numbers, partie1, 'ro')
line2, = plt.plot(numbers, partie2, 'go')
plot_line(numbers, partie1)
plot_line(numbers, partie2)
plt.xlabel('nombre')
plt.ylabel('temps')
plt.figlegend((line1, line2), ('Algo1', 'Algo2'), 'upper left')
plt.savefig('Algorithme1 VS Algorithme2.png')
#plt.show()




partie3 = [0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.001000, 0.002000, 0.002000, 0.002000, 0.003000]

plt.title('Algorithme1 VS Algorithme2 VS Algorithme3')
plt.axis([1000003, 2048000011, 0, 25])
line1, = plt.plot(numbers, partie1, 'ro')
line2, = plt.plot(numbers, partie2, 'go')
line3, = plt.plot(numbers, partie3, 'bo')
plot_line(numbers, partie1)
plot_line(numbers, partie2)
plot_line(numbers, partie3)
plt.xlabel('nombre')
plt.ylabel('temps')
plt.figlegend((line1, line2, line3), ('Algo1', 'Algo2', 'Algo3'), 'upper left')
plt.savefig('Algorithme1 VS Algorithme2 VS Algorithme3.png')
#plt.show()