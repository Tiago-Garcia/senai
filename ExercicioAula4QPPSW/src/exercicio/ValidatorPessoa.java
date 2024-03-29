
package exercicio;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoa {
    
// retorna true se estiver ok, ou false se ouve algo errado
    public boolean validar(Pessoa pessoa){
        // FAZER AS VALIDACOES AQUI DENTRO 
         boolean ret = true;
         
        // EXEMPLO, validacao de uma parte do campo NOME
        if( pessoa != null && pessoa.getNome().equals("")){
            ret = false;
        } else if(pessoa != null && pessoa.getNome().length() > 30){
            ret = false;
        } else if(pessoa.getEndereco() != null &&( 
                pessoa.getEndereco().equals("") || pessoa.getEndereco().length() > 50)){
            ret = false;
        }else if(pessoa.getTelefone()!= null &&( 
                pessoa.getTelefone().length() > 0 && pessoa.getEndereco().length() > 20)){
            ret = false;
        } 
        else if(pessoa.getDddTelefone().equals("") == false &&
                (!eNumero(pessoa.getDddTelefone()) ||                        
                 pessoa.getDddTelefone().length() >2)){
            ret = false;
        }else if( eNumero(pessoa.getDataNascimentoDia()) == false ){
            ret = false;
        }else if( (eNumero(pessoa.getDataNascimentoDia()) && 
                (getNumero(pessoa.getDataNascimentoDia()) < 1 
                        || getNumero(pessoa.getDataNascimentoDia())  > 30) )){
            ret = false;
        }
        else if( eNumero(pessoa.getDataNascimentoMes()) == false ){
            ret = false;
        }
        else if( (eNumero(pessoa.getDataNascimentoMes()) && 
                (getNumero(pessoa.getDataNascimentoMes()) < 1 
                        || getNumero(pessoa.getDataNascimentoMes())  > 12) )){
            ret = false;
        }
        else if( eNumero(pessoa.getDataNascimentoAno()) == false ){
            ret = false;
        }
        else if( (eNumero(pessoa.getDataNascimentoAno()) && 
                 getNumero(pessoa.getDataNascimentoAno())  < 1900) ){
            ret = false;
        }else if(pessoa.getSexo() != null &&   (
                !pessoa.getSexo().equalsIgnoreCase("m") && !pessoa.getSexo().equalsIgnoreCase("f"))){
            ret = false;
        } 
        
        
        return ret;
    }
    
    private double getNumero(String numero){      
         
           return  Double.parseDouble(numero);
    }
    
    private boolean eNumero(String numero){
        boolean ret = true;
        try{
         
            Double.parseDouble(numero);
         
        }catch(Exception e){
            ret = false;  
        }
        return ret;
    }
    
}
