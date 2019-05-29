/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {
    
   
    private Pessoa criaPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("joao");
        pessoa.setEndereco("rua x");
        pessoa.setDataNascimentoDia("10");
        pessoa.setDataNascimentoAno("2000");
        pessoa.setDataNascimentoMes("12");
        pessoa.setDddTelefone("51");
        pessoa.setTelefone("1234567");
        pessoa.setSexo("m");
        pessoa.setNumeroEndereco("123");
        return pessoa;
    }
    
    @Test
    public void testvalidaNomeOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();
        pessoa.setNome("teste");
        Assert.assertTrue(validator.validar(pessoa));
        pessoa.setNome("012345678901234567890123456789");
        Assert.assertTrue(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaNomeError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();
        pessoa.setNome("");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setNome("0123456789012345678901234567890");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaEnderecoOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setEndereco("a");
        Assert.assertTrue(validator.validar(pessoa));
         pessoa.setEndereco("012345678901234567890123456789012345678901234567890");
        
    }
    
     @Test
    public void testvalidaEnderecoError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setEndereco("");
        Assert.assertFalse(validator.validar(pessoa));
         pessoa.setEndereco("0123456789012345678901234567890123456789012345678901");
         Assert.assertFalse(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaDDDTelefoneOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDddTelefone("51");
        Assert.assertTrue(validator.validar(pessoa));
        pessoa.setDddTelefone("5");
        Assert.assertTrue(validator.validar(pessoa));
        
        
    }
    
    @Test
    public void testvalidaDDDTelefoneError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDddTelefone("51abc");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDddTelefone("534");
        Assert.assertFalse(validator.validar(pessoa));
        
        
    }
    
    @Test
    public void testvalidaTelefoneOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setTelefone("012345678012345678");
        Assert.assertTrue(validator.validar(pessoa));
         pessoa.setTelefone("");
        Assert.assertTrue(validator.validar(pessoa));
        
        
    }
    
     @Test
    public void testvalidaTelefoneError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setEndereco("0123456789012345678901");
        Assert.assertFalse(validator.validar(pessoa));
       
    }
    
     @Test
    public void testvalidaDataNascimentoDiaOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoDia("1");
        Assert.assertTrue(validator.validar(pessoa));
         pessoa.setDataNascimentoDia("30");
        Assert.assertTrue(validator.validar(pessoa));
        
        
    }
    
     @Test
    public void testvalidaDataNascimentoDiaError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoDia("");
        Assert.assertFalse(validator.validar(pessoa));
         pessoa.setDataNascimentoDia("abc");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDataNascimentoDia("0");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDataNascimentoDia("31");
        Assert.assertFalse(validator.validar(pessoa));
       
    }
    
    
     @Test
    public void testvalidaDataNascimentoMesOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoMes("1");
        Assert.assertTrue(validator.validar(pessoa));
         pessoa.setDataNascimentoMes("12");
        Assert.assertTrue(validator.validar(pessoa));
        
        
    }
    
     @Test
    public void testvalidaDataNascimentoMesError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoMes("");
        Assert.assertFalse(validator.validar(pessoa));
         pessoa.setDataNascimentoMes("abc");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDataNascimentoMes("0");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDataNascimentoMes("13");
        Assert.assertFalse(validator.validar(pessoa));
       
    }
    
    @Test
    public void testvalidaDataNascimentoAnpOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoAno("1900");
        Assert.assertTrue(validator.validar(pessoa));
        
    }
    
     @Test
    public void testvalidaDataNascimentoAnoError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setDataNascimentoAno("");
        Assert.assertFalse(validator.validar(pessoa));
         pessoa.setDataNascimentoAno("abc");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setDataNascimentoAno("1899");
        Assert.assertFalse(validator.validar(pessoa));
        
       
    }
    
    @Test
    public void testvalidaSexoOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setSexo("m");
        Assert.assertTrue(validator.validar(pessoa));
        pessoa.setSexo("f");
        Assert.assertTrue(validator.validar(pessoa));
        
        
    }
    
    @Test
    public void testvalidaSexoError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();        
        pessoa.setSexo("");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setSexo("abc");
        Assert.assertFalse(validator.validar(pessoa));
        pessoa.setSexo("masculino");
        Assert.assertFalse(validator.validar(pessoa));
        
        
    }
}
