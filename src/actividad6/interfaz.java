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
		setBounds(100, 100, 800, 550);

		Font tituloFont = new Font("Arial", Font.BOLD, 28);
		Font labelFont = new Font("Arial", Font.BOLD, 15);
		Font inputFont = new Font("Arial", Font.PLAIN, 14);

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(10,10,10,10));
		setContentPane(contentPane);

		
		JLabel titulo = new JLabel("REGISTRO DE USUARIOS");
		titulo.setFont(tituloFont);
		titulo.setForeground(Color.RED);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(titulo, BorderLayout.NORTH);

		
		JPanel panelPrincipal = new JPanel(new GridLayout(2,2,15,15));
		panelPrincipal.setBorder(new EmptyBorder(10,10,10,10));
		contentPane.add(panelPrincipal, BorderLayout.CENTER);

	
		JPanel datos = new JPanel(new GridLayout(6,2,8,8));
		datos.setBackground(Color.LIGHT_GRAY);
		datos.setBorder(BorderFactory.createTitledBorder("Datos Generales"));

		JLabel nombre = new JLabel("Nombres:");
		nombre.setFont(labelFont);
		JTextField txtNombre = new JTextField();
		txtNombre.setFont(inputFont);

		JLabel paterno = new JLabel("Apellido Paterno:");
		paterno.setFont(labelFont);
		JTextField txtPaterno = new JTextField();
		txtPaterno.setFont(inputFont);

		JLabel materno = new JLabel("Apellido Materno:");
		materno.setFont(labelFont);
		JTextField txtMaterno = new JTextField();
		txtMaterno.setFont(inputFont);

		JLabel fecha = new JLabel("Fecha Nacimiento:");
		fecha.setFont(labelFont);
		JTextField txtFecha = new JTextField();
		txtFecha.setFont(inputFont);

		JLabel sexo = new JLabel("Sexo:");
		sexo.setFont(labelFont);

		JPanel sexoPanel = new JPanel();
		sexoPanel.setBackground(new Color(210,255,230));

		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton femenino = new JRadioButton("Femenino");

		masculino.setFont(inputFont);
		femenino.setFont(inputFont);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(masculino);
		grupo.add(femenino);

		sexoPanel.add(masculino);
		sexoPanel.add(femenino);

		JLabel pais = new JLabel("Nacionalidad:");
		pais.setFont(labelFont);

		JComboBox<String> comboPais = new JComboBox<>();
		comboPais.setFont(inputFont);
		comboPais.addItem("Estados Unidos");
		comboPais.addItem("México");
		comboPais.addItem("Argentina");
		comboPais.addItem("Chile");

		datos.add(nombre);
		datos.add(txtNombre);
		datos.add(paterno);
		datos.add(txtPaterno);
		datos.add(materno);
		datos.add(txtMaterno);
		datos.add(fecha);
		datos.add(txtFecha);
		datos.add(sexo);
		datos.add(sexoPanel);
		datos.add(pais);
		datos.add(comboPais);

		panelPrincipal.add(datos);

		
		JPanel perfil = new JPanel(new GridLayout(4,1,5,10));
		perfil.setBackground(SystemColor.activeCaption);
		perfil.setBorder(BorderFactory.createTitledBorder("Perfil del usuario"));

		JLabel img = new JLabel("IMAGEN");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		img.setFont(labelFont);

		JCheckBox foto = new JCheckBox("Mostrar foto de perfil");
		JCheckBox fechaCheck = new JCheckBox("Mostrar fecha de nacimiento");

		foto.setFont(inputFont);
		fechaCheck.setFont(inputFont);

		perfil.add(img);
		perfil.add(foto);
		perfil.add(fechaCheck);

		panelPrincipal.add(perfil);

		
		JPanel descripcion = new JPanel(new BorderLayout());
		descripcion.setBackground(new Color(205, 133, 63));
		descripcion.setBorder(BorderFactory.createTitledBorder("Descripción"));

		JTextArea area = new JTextArea();
		area.setFont(inputFont);
		JScrollPane scroll = new JScrollPane(area);

		descripcion.add(scroll, BorderLayout.CENTER);

		panelPrincipal.add(descripcion);

	
		JPanel preferencias = new JPanel(new BorderLayout());
		preferencias.setBackground(new Color(143, 188, 143));
		preferencias.setBorder(BorderFactory.createTitledBorder("Preferencias"));

		String[] opciones = {"Cantar","Escuchar música","Leer","Deportes","Otros"};
		JList<String> lista = new JList<>(opciones);
		lista.setFont(inputFont);

		preferencias.add(new JScrollPane(lista), BorderLayout.CENTER);

		JPanel botones = new JPanel(new GridLayout(3,1,10,10));
		botones.setBackground(new Color(220,230,255));

		JButton nuevo = new JButton("Nuevo");
		JButton guardar = new JButton("Guardar");
		JButton salir = new JButton("Salir");

		nuevo.setFont(labelFont);
		guardar.setFont(labelFont);
		salir.setFont(labelFont);

		botones.add(nuevo);
		botones.add(guardar);
		botones.add(salir);

		preferencias.add(botones, BorderLayout.EAST);

		panelPrincipal.add(preferencias);
	}
}