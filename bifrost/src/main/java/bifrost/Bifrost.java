package bifrost;

import discoverypattern.controller.Discovery;
import spyclass.controller.SpyClass;

public class Bifrost {
	
	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		args = new String[] {"/home/suporte/Projeto/bifrost.config","/home/suporte/Projeto/CIS350_Netter_Center_Project"};
		if (args == null || args.length != 2) {
			throw new Exception("Parametros não informados: arquivo de configuração e repositório");
		}
//		SpyClass spy = new SpyClass();
		SpyClass.run(args[1], args[0]);
		// cria o arquivo 
//		Discovery discovery = new Discovery();
		Discovery.run(args[1]);
	}
}
