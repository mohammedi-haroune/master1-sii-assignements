import numpy as np
import matplotlib.pyplot as plt
from scipy import interpolate

inputs = [ 10 , 1000 , 5000 , 10000 , 50000 ]

def plot_algo_complexity( sorted, inversed):
	plt.title('Pire VS Meilleur cas selection')
	plt.axis([min(inputs), max(inputs), min(sorted + inversed ), max(sorted + inversed )])
	sorted_line, = plt.plot(inputs, sorted, 'go')
	inversed_line, = plt.plot(inputs, inversed, 'ro')
	plt.figlegend((sorted_line, inversed_line), ('Meilleur cas', 'Pire cas' ), 'upper right')
	plt.xlabel('la taille du tableau')
	plt.ylabel('le temps d\'execution')


millieur = [265 , 2006995 , 50034995 , 200069995 , 5000349995]
pire = [424 , 3508489 , 87542489 , 350084989 , 8750424989]


plot_algo_complexity(millieur , pire)
plt.savefig('piremeilleur.png')
plt.show()
plt.clf()


