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
		empresaDAO.exclui("89424232000180");
		assertEquals(1,empresaDAO.adiciona(empresa));
		empresaDAO.exclui("89424232000180");
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
//=============================================================================================	
	@Test
	public void CT04UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("00000000000000");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}	
	}
	@Test
	public void CT05UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("11111111111111");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
	}
	@Test
	public void CT06UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("22222222222222");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}	
	}
	@Test
	public void CT07UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("33333333333333");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
	}
	@Test
	public void CT08UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("44444444444444");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}	
	}
	@Test
	public void CT09UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("55555555555555");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
	}
	@Test
	public void CT10UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("66666666666666");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}	
	}
	@Test
	public void CT11UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("77777777777777");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
	}
	@Test
	public void CT12UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("88888888888888");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}	
	}
	@Test
	public void CT13UC01A3Cadastra_empresa_cnpj_invalido() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setCnpj("99999999999999");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("CNPJ inválido!" , e.getMessage());
		}
	}
	
	@Test
	public void CT14UC01A3Cadastra_empresa_nome_vazio() {
		Empresa empresa2 = new Empresa();
		try{
			empresa2.setNomeDaEmpresa("");
			fail("deveria disparar uma exception");
		} catch (Exception e) {
			assertEquals("nome da empresa inválido!" , e.getMessage());
		}
	}
	@Test
	public void CT15UC01FBCadastrar_empresa_com_sucesso() {
		
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("01636713000109");
		empresa2.setNomeDaEmpresa("empresa Y");
		empresa2.setNomeFantasia("Fantasia Y");
		empresa2.setEndereco("Rua Frei João, 59");
		empresa2.setTelefone("88882233");
				
		assertEquals(1,empresaDAO.adiciona(empresa2));
		empresaDAO.exclui("01636713000109");
		//fail("Not yet implemented");
	}
	
//=============================================================================================	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
