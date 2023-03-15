import javax.swing.JOptionPane

var matriz0 = Array(3){IntArray(3)}
var matrizT = Array(3){IntArray(3)}

for(i in(0 until 3)){
    for(j in(0 until 3)){
        matriz0[i][j] = JOptionPane.showInputDialog("Ingresa el numero en [${i+1}] [${j+1}]").toInt()
    }
}

for(i in(0 until 3)){
    for (j in (0 until 3)){
        matrizT[i][j] = matriz0[j][i]
    }
}

var numMatrices = ""
for (i in(0 until 3)){
    for(j in(0 until 3)){
        numMatrices = "$numMatrices ${matrizT[i][j]} | "
    }
    numMatrices = "$numMatrices\n"
}

JOptionPane.showMessageDialog(null, "La matriz es la siguiente:\n$numMatrices\n")