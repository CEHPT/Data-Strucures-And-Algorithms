#include <stdio.h.>
#include <stdlib.h>

int main() 
{
	int opt;

	printf("\nLinked List Using C Programming\n");
	
	loadMemory();
	
	
	do{
		printf("\nPls chooice the option\n");
	
		printf("\n1.Add Node");
		printf("\n2.List Nodes");
		printf("\n3.Delete Node (Using roll number");
		printf("\n4.Insert before (Using roll number");
		printf("\n5.Search Node");
		printf("\n9.Exit\n");	  
	
		scanf("%d" , &opt);
		fflush(stdin); 
		
		switch(opt) {
		
			case 1 : addNode(); break;
			case 2 : listNodes(); break;
			case 3 : deleteNode(); break; 
			case 4 : insertNode(); break;
			case 5 : searchNode(); break;
		}
	
	}while(opt != 9);
	
	writeFile();

}

