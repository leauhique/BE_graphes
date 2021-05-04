package org.insa.graphs.algorithm.shortestpath;



import org.insa.graphs.algorithm.utils.BinaryHeap;
import org.insa.graphs.model.Arc;
import org.insa.graphs.model.Graph;

public class DijkstraAlgorithm extends ShortestPathAlgorithm {

    public DijkstraAlgorithm(ShortestPathData data) {
        super(data);
    }

   
    @Override
    protected ShortestPathSolution doRun() {
        final ShortestPathData data = getInputData();
        ShortestPathSolution solution = null;
        // TODO:
        
        //Associer label à noeud
        Graph graph = data.getGraph();
        final int nbNodes = graph.size();
        Label[] labels = new Label [nbNodes];
       
        for (int i = 0 ; i < nbNodes; i++) {
        	labels[i]=new Label(i);
        }
        labels[data.getOrigin().getId()].setCost(0);
        	
        //Dijkstra
        //déclaration du tas
        BinaryHeap<Label> tasBinaire = new BinaryHeap<Label>();
        tasBinaire.insert(labels[data.getOrigin().getId()]);
       while(sommet marque & arrivé trouvé) {
    	   Label courant = tasBinaire.deleteMin();
    	   courant.setMarque(true);
    	   for(Arc arc : graph.getNodes().get(courant.getSommetCourrant()).getSuccessors()) {
    		   Label successor = labels[arc.getDestination().getId()]; 
    		   if(successor.isMarque()==false) {
    			   if(successor.getCost()> courant.getCost()+data.getCost(arc)) {
    				   
    				   if (!Double.isInfinite(successor.getCost())) {
        				   tasBinaire.remove(successor);
        				   
        			   }
    				   successor.setCost(courant.getCost()+data.getCost(arc));
    				   tasBinaire.insert(successor);
    			   }
    		   }
    			   
    	   }
    	   
    	// Small test to check allowed roads...
    	   //moyen de transport
           if (!data.isAllowed(arc)) {
               continue;
           }
    	   
    	   
    	   
       }
        
        
       // for (int i = 0; i<nbNodes)
        
        
        return solution;
    }

}
