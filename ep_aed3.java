package ep_aed1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ep_aed1 {
		public static void main(String[] args){
		buscaIngenua();
		buscaArvoreB();//Inicia a busca por arvore Binaria nao AVL
	}
	
	public static void buscaArvoreBAVL() {
		HashMap<String,long[]> tempos = new HashMap<String, long[]>();
		ArvoreBAVL pile;
		for(int i=1; i<100; i++) {
			System.out.println("Starting task"+i+" with Arvore Binaria AVL");
			long[] temposAux = new long[3];
			try {
				pile = new ArvoreBAVL();
				String fileName = "tarefas"+i+"000.txt";
				File entrada = new File("src/ep_aed1/entradas/"+fileName);
				Scanner leitor = new Scanner(entrada);
				temposAux[0] = System.currentTimeMillis();
				while(leitor.hasNextLine()) {
					String line = leitor.nextLine();
					if(!line.isEmpty()) {
						pile.insert(Long.parseLong(line));
					}
				}
				leitor.close();
				Scanner proofReader = new Scanner(entrada);
				FileWriter writer = new FileWriter("src/ep_aed1/saidas_buscaArvoreBAVL/"+fileName);
				while(proofReader.hasNextLine()) {
					String line = proofReader.nextLine();
					if(!line.isEmpty()) {
						writer.write(line+" "+pile.searchAVLBool(Long.parseLong(line))+"\n");
					}
				}
				temposAux[1] = System.currentTimeMillis();
				temposAux[2] = temposAux[1]-temposAux[0];
				tempos.put(fileName, temposAux);
				writer.close();
				proofReader.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter writerTempo = new FileWriter("src/ep_aed1/tempo_saidas_buscaArvoreBAVL/tempos.txt");
			writerTempo.write("Tarefa; duracao(ms)\n");
			for(String key : tempos.keySet()) {
				writerTempo.write(key+"; "+tempos.get(key)[2]+"\n");
			}
			writerTempo.write("Duracao Total(ms): "+(tempos.get("tarefas99000.txt")[1]-tempos.get("tarefas1000.txt")[0]));
			writerTempo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void buscaArvoreB() {
		HashMap<String,long[]> tempos = new HashMap<String, long[]>();
		ArvoreBinaria pile;
		for(int i=1; i<100; i++) {
			System.out.println("Starting task"+i+" with Arvore Binaria");
			long[] temposAux = new long[3];
			try {
				pile = new ArvoreBinaria();
				String fileName = "tarefas"+i+"000.txt";
				File entrada = new File("src/ep_aed1/entradas/"+fileName);
				Scanner leitor = new Scanner(entrada);
				temposAux[0] = System.currentTimeMillis();
				while(leitor.hasNextLine()) {
					String line = leitor.nextLine();
					if(!line.isEmpty()) {
						pile.insert(Long.parseLong(line));
					}
				}
				leitor.close();
				Scanner proofReader = new Scanner(entrada);
				FileWriter writer = new FileWriter("src/ep_aed1/saidas_buscaArvoreB/"+fileName);
				while(proofReader.hasNextLine()) {
					String line = proofReader.nextLine();
					if(!line.isEmpty()) {
						writer.write(line+" "+pile.findNode(Long.parseLong(line))+"\n");
					}
				}
				temposAux[1] = System.currentTimeMillis();
				temposAux[2] = temposAux[1]-temposAux[0];
				tempos.put(fileName, temposAux);
				writer.close();
				proofReader.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter writerTempo = new FileWriter("src/ep_aed1/tempo_saidas_buscaArvoreB/tempos.txt");
			writerTempo.write("Tarefa; duracao(ms)\n");
			for(String key : tempos.keySet()) {
				writerTempo.write(key+"; "+tempos.get(key)[2]+"\n");
			}
			writerTempo.write("Duracao Total(ms): "+(tempos.get("tarefas99000.txt")[1]-tempos.get("tarefas1000.txt")[0]));
			writerTempo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void buscaIngenua() {
		HashMap<String,long[]> tempos = new HashMap<String, long[]>();
		BuscaIngenua pile;
		for(int i=1; i<100; i++) {
			System.out.println("Starting task"+i+" with Busca Linear");
			long[] temposAux = new long[3];
			try {
				pile = new BuscaIngenua();
				String fileName = "tarefas"+i+"000.txt";
				File entrada = new File("src/ep_aed1/entradas/"+fileName);
				Scanner leitor = new Scanner(entrada);
				temposAux[0] = System.currentTimeMillis();
				while(leitor.hasNextLine()) {
					String line = leitor.nextLine();
					if(!line.isEmpty()) {
						pile.insert(line);
					}
				}
				leitor.close();
				Scanner proofReader = new Scanner(entrada);
				FileWriter writer = new FileWriter("src/ep_aed1/saidas_buscaIngenua/"+fileName);
				while(proofReader.hasNextLine()) {
					String line = proofReader.nextLine();
					if(!line.isEmpty()) {
						writer.write(line+" "+pile.find(line)+"\n");
					}
				}
				temposAux[1] = System.currentTimeMillis();
				temposAux[2] = temposAux[1]-temposAux[0];
				tempos.put(fileName, temposAux);
				writer.close();
				proofReader.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter writerTempo = new FileWriter("src/ep_aed1/tempo_saidas_buscaIngenua/tempos.txt");
			writerTempo.write("Tarefa; duracao(ms)\n");
			for(String key : tempos.keySet()) {
				writerTempo.write(key+"; "+tempos.get(key)[2]+"\n");
			}
			writerTempo.write("Duracao Total(ms): "+(tempos.get("tarefas99000.txt")[1]-tempos.get("tarefas1000.txt")[0]));
			writerTempo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
