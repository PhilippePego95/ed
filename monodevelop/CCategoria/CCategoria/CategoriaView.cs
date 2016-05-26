using System;
using System.Data;

namespace CCategoria {
	public partial class CategoriaView : Gtk.Window {
		public CategoriaView () : 
				base(Gtk.WindowType.Toplevel) {
			this.Build ();
			saveAction.Activated += delegate {
				IDbCommand dbCommand = app.Instance.DbConnection.CreateCommand ();
				dbCommand.CommandText = "insert into categoria  (nombre) values ()";
				string nombre = entryNombre.Text;
				Console.WriteLine ("saveaction.Action");
			};
		}
	}
}


