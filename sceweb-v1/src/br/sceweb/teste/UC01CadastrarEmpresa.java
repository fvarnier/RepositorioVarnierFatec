package br.sceweb.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

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
	public void CT01UC01FBCadastrar_empresa_com_sucesso() {
		empresaDAO.excluir("89424232000180");
		assertEquals(1,empresaDAO.adiciona(empresa));
		empresaDAO.excluir("89424232000180");
		//fail("Not yet implemented");
	}
	
	@Test (expected = RuntimeException.class)
	public void CT02UC01A2Cadastra_empresa_cnpj_ja_cadastrado() {
		empresaDAO.adiciona(empresa);
		assertEquals(0,empresaDAO.adiciona(empresa));
	}
	
	@Test
	public void CT03UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("8942423200018");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
