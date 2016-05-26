using System;
using System.Data;

namespace CCategoria {

	public class app {
		private static app instance = new app();
		public static app Instance{
			get { return instance;}
		}

		private app () {
		}
			private IDbConnection dbConnection;
			public IDbConnection  DbConnection{
				get{ return dbConnection;}
			set{ dbConnection = value;}



		}
	}
}