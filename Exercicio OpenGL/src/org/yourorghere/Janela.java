package org.yourorghere;


import javax.swing.*;
import java.awt.*; 
import java.awt.event.MouseListener;
import javax.media.opengl.*;

public class Janela
{
	private Renderizar renderer;

	/**
	 * Construtor da classe Janela que não recebe parâmetros. Cria uma janela e insere  
	 * um componente canvas OpenGL.
	 */
	public Janela()
	{
		// Cria janela
		JFrame janela = new JFrame("Modelagem 2D em OpenGL");   
		janela.setBounds(50,100,600,600); 
		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		BorderLayout layout = new BorderLayout(); 
		Container caixa=janela.getContentPane();
		caixa.setLayout(layout); 

		// Cria um objeto GLCapabilities para especificar o número de bits 
		// por pixel para RGBA
		GLCapabilities c = new GLCapabilities();
		c.setRedBits(8);
		c.setBlueBits(8);
		c.setGreenBits(8);
		c.setAlphaBits(8); 

		// Cria o objeto que irá gerenciar os eventos
		renderer = new Renderizar() ;

		// Cria um canvas, adiciona na janela, e especifica o objeto "ouvinte" 
		// para os eventos Gl, de mouse e teclado
		GLCanvas canvas = new GLCanvas(c);
		janela.add(canvas,BorderLayout.CENTER);
		canvas.addGLEventListener(renderer);        
		canvas.addMouseListener((MouseListener) renderer);  
		canvas.addKeyListener(renderer);
		janela.setVisible(true);
		canvas.requestFocus();
	}

	/**
	 * Método main que apenas cria um objeto Janela.
	 */
	public static void main(String args[])
	{
		Janela jan = new Janela();
	}
}
