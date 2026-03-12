package actividad6;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class interfaz extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				interfaz frame = new interfaz();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public interfaz() {

	    setTitle("Registro de usuarios");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Font tituloFont = new Font("Arial", Font.BOLD, 28);
	    Font labelFont = new Font("Arial", Font.BOLD, 15);
	    Font inputFont = new Font("Arial", Font.PLAIN, 14);

	    contentPane = new JPanel(new BorderLayout(10,10));
	    contentPane.setBackground(Color.BLACK);
	    contentPane.setBorder(new EmptyBorder(10,10,10,10));
	    setContentPane(contentPane);

	    // TITULO
	    JLabel titulo = new JLabel("REGISTRO DE USUARIOS");
	    titulo.setFont(tituloFont);
	    titulo.setForeground(Color.RED);
	    titulo.setHorizontalAlignment(SwingConstants.CENTER);
	    contentPane.add(titulo, BorderLayout.NORTH);


	    // PANEL CENTRAL (2 columnas)
	    JPanel centro = new JPanel(new GridLayout(1,2,15,15));
	    centro.setOpaque(false);
	    contentPane.add(centro, BorderLayout.CENTER);


	    // ---------------- DATOS GENERALES ----------------
	    JPanel datos = new JPanel(new GridLayout(6,2,8,8));
	    datos.setBackground(Color.LIGHT_GRAY);
	    datos.setBorder(BorderFactory.createTitledBorder("Datos Generales"));

	    JLabel nombre = new JLabel("Nombres:");
	    nombre.setFont(labelFont);
	    JTextField txtNombre = new JTextField();

	    JLabel paterno = new JLabel("Apellido Paterno:");
	    paterno.setFont(labelFont);
	    JTextField txtPaterno = new JTextField();

	    JLabel materno = new JLabel("Apellido Materno:");
	    materno.setFont(labelFont);
	    JTextField txtMaterno = new JTextField();

	    JLabel fecha = new JLabel("Fecha Nacimiento:");
	    fecha.setFont(labelFont);
	    JTextField txtFecha = new JTextField();

	    JLabel sexo = new JLabel("Sexo:");
	    sexo.setFont(labelFont);

	    JPanel sexoPanel = new JPanel();
	    JRadioButton masculino = new JRadioButton("Masculino");
	    JRadioButton femenino = new JRadioButton("Femenino");

	    ButtonGroup grupo = new ButtonGroup();
	    grupo.add(masculino);
	    grupo.add(femenino);

	    sexoPanel.add(masculino);
	    sexoPanel.add(femenino);

	    JLabel pais = new JLabel("Nacionalidad:");
	    pais.setFont(labelFont);

	    JComboBox<String> comboPais = new JComboBox<>();
	    comboPais.addItem("Estados Unidos");
	    comboPais.addItem("México");
	    comboPais.addItem("Argentina");
	    comboPais.addItem("Chile");

	    datos.add(nombre); datos.add(txtNombre);
	    datos.add(paterno); datos.add(txtPaterno);
	    datos.add(materno); datos.add(txtMaterno);
	    datos.add(fecha); datos.add(txtFecha);
	    datos.add(sexo); datos.add(sexoPanel);
	    datos.add(pais); datos.add(comboPais);

	    centro.add(datos);


	    // ---------------- PERFIL ----------------
	    JPanel perfil = new JPanel(new BorderLayout(10,10));
	    perfil.setBackground(SystemColor.activeCaption);
	    perfil.setBorder(BorderFactory.createTitledBorder("Perfil del usuario"));

	    JPanel opcionesPerfil = new JPanel(new GridLayout(2,1));

	    JCheckBox foto = new JCheckBox("Mostrar foto de perfil");
	    JCheckBox fechaCheck = new JCheckBox("Mostrar fecha de nacimiento");

	    opcionesPerfil.add(foto);
	    opcionesPerfil.add(fechaCheck);

	    ImageIcon air = new ImageIcon("D:/Santiago/ACT1P3/planeLogo.png");
	    JLabel lblImagen = new JLabel(air);
	    lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

	    perfil.add(lblImagen, BorderLayout.CENTER);
	    perfil.add(opcionesPerfil, BorderLayout.SOUTH);

	    centro.add(perfil);


	    // ---------------- PARTE INFERIOR ----------------
	    JPanel inferior = new JPanel(new GridLayout(1,2,15,15));
	    inferior.setOpaque(false);
	    contentPane.add(inferior, BorderLayout.SOUTH);


	    // DESCRIPCION
	    JPanel descripcion = new JPanel(new BorderLayout());
	    descripcion.setBackground(new Color(205,133,63));
	    descripcion.setBorder(BorderFactory.createTitledBorder("Descripción"));

	    JTextArea area = new JTextArea(5,20);
	    descripcion.add(new JScrollPane(area), BorderLayout.CENTER);

	    inferior.add(descripcion);


	    // PREFERENCIAS
	    JPanel preferencias = new JPanel(new BorderLayout());
	    preferencias.setBackground(new Color(143,188,143));
	    preferencias.setBorder(BorderFactory.createTitledBorder("Preferencias"));

	    String[] opciones = {"Cantar","Escuchar música","Leer","Deportes","Otros"};
	    JList<String> lista = new JList<>(opciones);

	    preferencias.add(new JScrollPane(lista), BorderLayout.CENTER);

	    JPanel botones = new JPanel(new GridLayout(3,1,5,5));

	    JButton nuevo = new JButton("Nuevo");
	    JButton guardar = new JButton("Guardar");
	    JButton salir = new JButton("Salir");

	    botones.add(nuevo);
	    botones.add(guardar);
	    botones.add(salir);

	    preferencias.add(botones, BorderLayout.EAST);

	    inferior.add(preferencias);


	    pack();
	    setLocationRelativeTo(null);
	}}