import numpy as np
import matplotlib.pyplot as plt
from scipy import interpolate

inputs = [50000 , 100000 , 200000 , 400000 ]
#, 800000 , 3200000 , 6400000 , 12800000 , 25600000 , 1024000000 , 2048000000]

def plot_algo_complexity(name, sorted, inversed, random):
	plt.title(name)
	plt.axis([min(inputs), max(inputs), min(sorted + inversed + random), max(sorted + inversed + random)])
	sorted_line, = plt.plot(inputs, sorted, 'go')
	inversed_line, = plt.plot(inputs, inversed, 'ro')
	random_line, = plt.plot(inputs, random, 'bo')
	plt.figlegend((sorted_line, inversed_line, random_line), ('tableau trie dans le bon ordre', 'tableau non trie (aleatoire)' ,'tableau trie en ordre inverse'), 'upper right')
	plt.xlabel('la taille du tableau')
	plt.ylabel('le temps d\'execution')

name = 'tri par selection'
inversed_results = [3.263605, 13.000264, 52.035705, 242.122000]
sorted_results = [3.190134, 12.533366, 49.868602, 218.696002]
random_results = [3.133612, 12.563381, 50.082762, 192.308152]

plot_algo_complexity(name, sorted_results, inversed_results, random_results)
plt.savefig(name + '.png')
plt.show()
plt.clf()
