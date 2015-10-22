package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {
	
	static EmpresaDAO empresaDAO;
	static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa X");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("Fantasia");
		empresa.setEndereco("Rua Frei João, 59");
		empresa.setTelefone("88882233");
		}
		
	@Test
	public void CT01UC02FBConsultar_empresa_com_sucesso() {
		empresaDAO.adiciona(empresa);
		assertTrue(empresa.equals(empresaDAO.consultaEmpresas("89424232000180")));
		empresaDAO.exclui("89424232000180");
		//fail("Not yet implemented");
	}
	
	@Test
	public void CT02UC02FBConsultar_todas_as_empresas() {
		empresaDAO.adiciona(empresa);
		assertEquals(false, empresaDAO.consultaEmpresas().isEmpty());
		//assertTrue (empresaDAO.consultaEmpresas().size()>0);
		empresaDAO.exclui("89424232000180");
		//fail("Not yet implemented");
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

	

}
