package org.yourorghere;

import java.awt.event.*;
import javax.media.opengl.*;
import javax.media.opengl.glu.*;
import com.sun.opengl.util.*;

public class Renderizar extends MouseAdapter implements GLEventListener, KeyListener {

    // Atributos
    private GL gl;
    private GLU glu;
    private GLUT glut;
    private GLAutoDrawable glDrawable;
    private double fAspect;

    private float rodar;
    private float transladar;
    private int xTransladacao = 0;
    private int yTransladacao = 0;

    private float xRodar = 0;
    private float yRodar = 0;
    
    private float escalar = 1;

    private int opcao = 0;

    /**
     * Construtor da classe Renderer
     */
    public Renderizar() {
        // Inicializa o valor para correção de aspecto   
        fAspect = 1;
    }

    /**
     * Método definido na interface GLEventListener e chamado pelo objeto no
     * qual será feito o desenho logo após a inicialização do contexto OpenGL.
     */
    public void init(GLAutoDrawable drawable) {
        glDrawable = drawable;
        gl = drawable.getGL();
        // glu = drawable.getGLU();       
        glu = new GLU();
        glut = new GLUT();

        drawable.setGL(new DebugGL(gl));

        gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);

        // Define a janela de visualização 2D
        gl.glMatrixMode(GL.GL_PROJECTION);
        glu.gluOrtho2D(-10, 10, -10, 10);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        
    }

    /**
     * Desenha uma grade e os eixos cartesianos
     */
    public void desenhaGrade() {
        gl.glColor3f(0.8f, 0.8f, 0.8f);
        gl.glLineWidth(1.0f);
        gl.glBegin(GL.GL_LINES);
        for (float x = -10; x <= 10; x++) {
            gl.glVertex2f(-10, x);
            gl.glVertex2f(10, x);
            gl.glVertex2f(x, -10);
            gl.glVertex2f(x, 10);
        }
        gl.glEnd();
    }

    public void desenharTriangulo() {

        gl.glColor3f(0f, 0f, 0f);
        gl.glLineWidth(3.0f);

        gl.glRotatef(this.rodar,0, 0, 1);
        gl.glTranslatef(xTransladacao, yTransladacao, 0f);
        gl.glScalef(escalar, escalar, 0);

        
        
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(1.0f, 1.0f, 0.0f);    // Set the current drawing color to red
        gl.glVertex3f(0.0f, 2.0f, 0.0f);   // Top
        gl.glColor3f(0.0f, 1.0f, 0.0f);    // Set the current drawing color to green
        gl.glVertex3f(-2.0f, -2.0f, 0.0f); // Bottom Left
        gl.glColor3f(0.0f, 0.0f, 1.0f);    // Set the current drawing color to blue
        gl.glVertex3f(2.0f, -2.0f, 0.0f);  // Bottom Right
        gl.glEnd();

        gl.glFlush();
    }

    /**
     * Método definido na interface GLEventListener e chamado pelo objeto no
     * qual será feito o desenho para começar a fazer o desenho OpenGL pelo
     * cliente.
     */
    public void display(GLAutoDrawable drawable) {
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glLoadIdentity();

        desenhaGrade();
        desenharTriangulo();

    }

    /**
     * Método definido na interface GLEventListener e chamado pelo objeto no
     * qual será feito o desenho depois que a janela foi redimensionada.
     */
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        gl.glViewport(0, 0, width, height);
        fAspect = (float) width / (float) height;
    }

    /**
     * Método definido na interface GLEventListener e chamado pelo objeto no
     * qual será feito o desenho quando o modo de exibição ou o dispositivo de
     * exibição associado foi alterado.
     */
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    /**
     * Método da classe MouseAdapter que está sendo sobrescrito para gerenciar
     * os eventos de clique de mouse, de maneira que seja feito zoom in e zoom
     * out.
     *
     */
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getPoint().toString());
    }

    public void mouseClicked(MouseEvent e) {

//        if (e.getButton() == MouseEvent.BUTTON1) // botão 1
//        {
//            System.out.println("Clickou 1");
//        }
//        if (e.getButton() == MouseEvent.BUTTON3) // botão 2
//        {
//            System.out.println("Clickou 2");
//        }
           System.out.println(e.getLocationOnScreen().toString());
           xRodar = e.getLocationOnScreen().x;
           yRodar = e.getLocationOnScreen().y;
           
           glDrawable.display();
    }

    /**
     * Método definido na interface KeyListener que está sendo implementado
     * para, de acordo com as teclas pressionadas, permitir alterações sobre os
     * objetos ou área de desenho.
     */
    public void keyPressed(KeyEvent e) {
//        // F1
//        if (e.getKeyCode() == KeyEvent.VK_F1) {
//        } // F2
//        else if (e.getKeyCode() == KeyEvent.VK_F2) {
//        }

        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                this.rodar += 90;
                break;
            case KeyEvent.VK_D:
                this.rodar -= 90;
                break;
            case KeyEvent.VK_UP:
                yTransladacao += 2;
                break;
            case KeyEvent.VK_DOWN:
                yTransladacao -= 2;
                break;
            case KeyEvent.VK_LEFT:
                xTransladacao -= 2;
                break;
            case KeyEvent.VK_RIGHT:
                xTransladacao += 2;
                break;
            case KeyEvent.VK_Q:
                escalar += 1;
                break;
                
            case KeyEvent.VK_E:
                escalar -= 1;
                if(escalar <=0){
                    escalar = 1;
                }
                break;
                

            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;
        }
        glDrawable.display();

    }

    /**
     * Método definido na interface KeyListener.
     */
    public void keyTyped(KeyEvent e) {
    }

    /**
     * Método definido na interface KeyListener.
     */
    public void keyReleased(KeyEvent e) {
    }
}
