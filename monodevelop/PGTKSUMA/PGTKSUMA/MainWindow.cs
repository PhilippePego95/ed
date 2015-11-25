using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}


	protected void OnButton2Clicked (object sender, EventArgs e)
	{
		Decimal primero = Decimal.Parse(entry1.Text);
		Decimal segundo = Decimal.Parse(entry2.Text);
		Decimal res = primero + segundo;
		resultado.Text ="Resultado "+ res.ToString ();		
	}

	protected void OnButton1Clicked (object sender, EventArgs e)
	{
		Decimal primero = Decimal.Parse(entry1.Text);
		Decimal segundo = Decimal.Parse(entry2.Text);
		Decimal res = primero - segundo;
		resultado.Text ="Resultado "+ res.ToString ();
	}

	protected void OnButton3Clicked (object sender, EventArgs e)
	{
		Decimal primero = Decimal.Parse(entry1.Text);
		Decimal segundo = Decimal.Parse(entry2.Text);
		Decimal res = primero * segundo;
		resultado.Text ="Resultado "+ res.ToString ();
}

	protected void OnButton4Clicked (object sender, EventArgs e)
	{
		Decimal primero = Decimal.Parse(entry1.Text);
		Decimal segundo = Decimal.Parse(entry2.Text);
		Decimal res = primero / segundo;
		resultado.Text ="Resultado "+ res.ToString ();
	}
}
 