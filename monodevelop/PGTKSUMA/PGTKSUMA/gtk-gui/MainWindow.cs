
// This file has been generated by the GUI designer. Do not modify.
public partial class MainWindow
{
	private global::Gtk.VBox vbox4;
	private global::Gtk.HBox hbox3;
	private global::Gtk.Label num1;
	private global::Gtk.Entry entry1;
	private global::Gtk.HBox hbox1;
	private global::Gtk.Label num2;
	private global::Gtk.Entry entry2;
	private global::Gtk.HBox hbox4;
	private global::Gtk.HBox hbox7;
	private global::Gtk.Button button2;
	private global::Gtk.Button button1;
	private global::Gtk.Button button3;
	private global::Gtk.HBox hbox6;
	private global::Gtk.Button button4;
	private global::Gtk.HBox hbox5;
	private global::Gtk.Label resultado;
	private global::Gtk.VBox vbox1;

	protected virtual void Build ()
	{
		global::Stetic.Gui.Initialize (this);
		// Widget MainWindow
		this.Name = "MainWindow";
		this.Title = global::Mono.Unix.Catalog.GetString ("MainWindow");
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		// Container child MainWindow.Gtk.Container+ContainerChild
		this.vbox4 = new global::Gtk.VBox ();
		this.vbox4.Name = "vbox4";
		this.vbox4.Spacing = 6;
		// Container child vbox4.Gtk.Box+BoxChild
		this.hbox3 = new global::Gtk.HBox ();
		this.hbox3.Name = "hbox3";
		this.hbox3.Spacing = 6;
		// Container child hbox3.Gtk.Box+BoxChild
		this.num1 = new global::Gtk.Label ();
		this.num1.Name = "num1";
		this.num1.LabelProp = global::Mono.Unix.Catalog.GetString ("numero");
		this.hbox3.Add (this.num1);
		global::Gtk.Box.BoxChild w1 = ((global::Gtk.Box.BoxChild)(this.hbox3 [this.num1]));
		w1.Position = 0;
		w1.Expand = false;
		// Container child hbox3.Gtk.Box+BoxChild
		this.entry1 = new global::Gtk.Entry ();
		this.entry1.CanFocus = true;
		this.entry1.Name = "entry1";
		this.entry1.IsEditable = true;
		this.entry1.InvisibleChar = '•';
		this.hbox3.Add (this.entry1);
		global::Gtk.Box.BoxChild w2 = ((global::Gtk.Box.BoxChild)(this.hbox3 [this.entry1]));
		w2.Position = 1;
		this.vbox4.Add (this.hbox3);
		global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.vbox4 [this.hbox3]));
		w3.Position = 0;
		w3.Expand = false;
		w3.Fill = false;
		// Container child vbox4.Gtk.Box+BoxChild
		this.hbox1 = new global::Gtk.HBox ();
		this.hbox1.Name = "hbox1";
		this.hbox1.Spacing = 6;
		// Container child hbox1.Gtk.Box+BoxChild
		this.num2 = new global::Gtk.Label ();
		this.num2.Name = "num2";
		this.num2.LabelProp = global::Mono.Unix.Catalog.GetString ("numero 2");
		this.hbox1.Add (this.num2);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.hbox1 [this.num2]));
		w4.Position = 0;
		w4.Expand = false;
		w4.Fill = false;
		// Container child hbox1.Gtk.Box+BoxChild
		this.entry2 = new global::Gtk.Entry ();
		this.entry2.CanFocus = true;
		this.entry2.Name = "entry2";
		this.entry2.IsEditable = true;
		this.entry2.InvisibleChar = '•';
		this.hbox1.Add (this.entry2);
		global::Gtk.Box.BoxChild w5 = ((global::Gtk.Box.BoxChild)(this.hbox1 [this.entry2]));
		w5.Position = 1;
		this.vbox4.Add (this.hbox1);
		global::Gtk.Box.BoxChild w6 = ((global::Gtk.Box.BoxChild)(this.vbox4 [this.hbox1]));
		w6.Position = 1;
		w6.Expand = false;
		w6.Fill = false;
		// Container child vbox4.Gtk.Box+BoxChild
		this.hbox4 = new global::Gtk.HBox ();
		this.hbox4.Name = "hbox4";
		this.hbox4.Spacing = 6;
		// Container child hbox4.Gtk.Box+BoxChild
		this.hbox7 = new global::Gtk.HBox ();
		this.hbox7.Name = "hbox7";
		this.hbox7.Spacing = 6;
		// Container child hbox7.Gtk.Box+BoxChild
		this.button2 = new global::Gtk.Button ();
		this.button2.CanFocus = true;
		this.button2.Name = "button2";
		this.button2.UseUnderline = true;
		this.button2.BorderWidth = ((uint)(3));
		// Container child button2.Gtk.Container+ContainerChild
		global::Gtk.Alignment w7 = new global::Gtk.Alignment (0.5F, 0.5F, 0F, 0F);
		// Container child GtkAlignment.Gtk.Container+ContainerChild
		global::Gtk.HBox w8 = new global::Gtk.HBox ();
		w8.Spacing = 2;
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Image w9 = new global::Gtk.Image ();
		w9.Pixbuf = global::Stetic.IconLoader.LoadIcon (this, "gtk-add", global::Gtk.IconSize.Menu);
		w8.Add (w9);
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Label w11 = new global::Gtk.Label ();
		w8.Add (w11);
		w7.Add (w8);
		this.button2.Add (w7);
		this.hbox7.Add (this.button2);
		global::Gtk.Box.BoxChild w15 = ((global::Gtk.Box.BoxChild)(this.hbox7 [this.button2]));
		w15.Position = 0;
		w15.Expand = false;
		w15.Fill = false;
		// Container child hbox7.Gtk.Box+BoxChild
		this.button1 = new global::Gtk.Button ();
		this.button1.CanFocus = true;
		this.button1.Name = "button1";
		this.button1.UseUnderline = true;
		// Container child button1.Gtk.Container+ContainerChild
		global::Gtk.Alignment w16 = new global::Gtk.Alignment (0.5F, 0.5F, 0F, 0F);
		// Container child GtkAlignment.Gtk.Container+ContainerChild
		global::Gtk.HBox w17 = new global::Gtk.HBox ();
		w17.Spacing = 2;
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Image w18 = new global::Gtk.Image ();
		w18.Pixbuf = global::Stetic.IconLoader.LoadIcon (this, "gtk-remove", global::Gtk.IconSize.Menu);
		w17.Add (w18);
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Label w20 = new global::Gtk.Label ();
		w17.Add (w20);
		w16.Add (w17);
		this.button1.Add (w16);
		this.hbox7.Add (this.button1);
		global::Gtk.Box.BoxChild w24 = ((global::Gtk.Box.BoxChild)(this.hbox7 [this.button1]));
		w24.Position = 1;
		w24.Expand = false;
		w24.Fill = false;
		// Container child hbox7.Gtk.Box+BoxChild
		this.button3 = new global::Gtk.Button ();
		this.button3.CanFocus = true;
		this.button3.Name = "button3";
		this.button3.UseUnderline = true;
		// Container child button3.Gtk.Container+ContainerChild
		global::Gtk.Alignment w25 = new global::Gtk.Alignment (0.5F, 0.5F, 0F, 0F);
		// Container child GtkAlignment.Gtk.Container+ContainerChild
		global::Gtk.HBox w26 = new global::Gtk.HBox ();
		w26.Spacing = 2;
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Image w27 = new global::Gtk.Image ();
		w27.Pixbuf = global::Stetic.IconLoader.LoadIcon (this, "gtk-no", global::Gtk.IconSize.Menu);
		w26.Add (w27);
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Label w29 = new global::Gtk.Label ();
		w26.Add (w29);
		w25.Add (w26);
		this.button3.Add (w25);
		this.hbox7.Add (this.button3);
		global::Gtk.Box.BoxChild w33 = ((global::Gtk.Box.BoxChild)(this.hbox7 [this.button3]));
		w33.Position = 2;
		w33.Expand = false;
		w33.Fill = false;
		this.hbox4.Add (this.hbox7);
		global::Gtk.Box.BoxChild w34 = ((global::Gtk.Box.BoxChild)(this.hbox4 [this.hbox7]));
		w34.Position = 0;
		w34.Expand = false;
		w34.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.hbox6 = new global::Gtk.HBox ();
		this.hbox6.Name = "hbox6";
		this.hbox6.Spacing = 6;
		// Container child hbox6.Gtk.Box+BoxChild
		this.button4 = new global::Gtk.Button ();
		this.button4.CanFocus = true;
		this.button4.Name = "button4";
		this.button4.UseUnderline = true;
		// Container child button4.Gtk.Container+ContainerChild
		global::Gtk.Alignment w35 = new global::Gtk.Alignment (0.5F, 0.5F, 0F, 0F);
		// Container child GtkAlignment.Gtk.Container+ContainerChild
		global::Gtk.HBox w36 = new global::Gtk.HBox ();
		w36.Spacing = 2;
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Image w37 = new global::Gtk.Image ();
		w37.Pixbuf = global::Stetic.IconLoader.LoadIcon (this, "stock_right", global::Gtk.IconSize.Menu);
		w36.Add (w37);
		// Container child GtkHBox.Gtk.Container+ContainerChild
		global::Gtk.Label w39 = new global::Gtk.Label ();
		w39.LabelProp = global::Mono.Unix.Catalog.GetString ("Dividir");
		w39.UseUnderline = true;
		w36.Add (w39);
		w35.Add (w36);
		this.button4.Add (w35);
		this.hbox6.Add (this.button4);
		global::Gtk.Box.BoxChild w43 = ((global::Gtk.Box.BoxChild)(this.hbox6 [this.button4]));
		w43.Position = 0;
		w43.Expand = false;
		w43.Fill = false;
		this.hbox4.Add (this.hbox6);
		global::Gtk.Box.BoxChild w44 = ((global::Gtk.Box.BoxChild)(this.hbox4 [this.hbox6]));
		w44.Position = 1;
		// Container child hbox4.Gtk.Box+BoxChild
		this.hbox5 = new global::Gtk.HBox ();
		this.hbox5.Name = "hbox5";
		this.hbox5.Spacing = 6;
		this.hbox4.Add (this.hbox5);
		global::Gtk.Box.BoxChild w45 = ((global::Gtk.Box.BoxChild)(this.hbox4 [this.hbox5]));
		w45.Position = 2;
		this.vbox4.Add (this.hbox4);
		global::Gtk.Box.BoxChild w46 = ((global::Gtk.Box.BoxChild)(this.vbox4 [this.hbox4]));
		w46.Position = 2;
		w46.Expand = false;
		w46.Fill = false;
		// Container child vbox4.Gtk.Box+BoxChild
		this.resultado = new global::Gtk.Label ();
		this.resultado.Name = "resultado";
		this.resultado.LabelProp = global::Mono.Unix.Catalog.GetString ("resultado");
		this.vbox4.Add (this.resultado);
		global::Gtk.Box.BoxChild w47 = ((global::Gtk.Box.BoxChild)(this.vbox4 [this.resultado]));
		w47.Position = 3;
		w47.Expand = false;
		w47.Fill = false;
		// Container child vbox4.Gtk.Box+BoxChild
		this.vbox1 = new global::Gtk.VBox ();
		this.vbox1.Name = "vbox1";
		this.vbox1.Spacing = 6;
		this.vbox4.Add (this.vbox1);
		global::Gtk.Box.BoxChild w48 = ((global::Gtk.Box.BoxChild)(this.vbox4 [this.vbox1]));
		w48.Position = 4;
		this.Add (this.vbox4);
		if ((this.Child != null)) {
			this.Child.ShowAll ();
		}
		this.DefaultWidth = 434;
		this.DefaultHeight = 183;
		this.Show ();
		this.DeleteEvent += new global::Gtk.DeleteEventHandler (this.OnDeleteEvent);
		this.button2.Clicked += new global::System.EventHandler (this.OnButton2Clicked);
		this.button1.Clicked += new global::System.EventHandler (this.OnButton1Clicked);
		this.button3.Clicked += new global::System.EventHandler (this.OnButton3Clicked);
		this.button4.Clicked += new global::System.EventHandler (this.OnButton4Clicked);
	}
}