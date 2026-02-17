
#include <stdio.h.>
#include <stdlib.h>

typedef struct student {

	int rollNumber;
	char name[50];
	
	struct student *nextNode;

}Student;


Student *first = NULL , *last = NULL;


void listNodes() 
{
	Student *tp;
	
	tp = first;
	
	while(tp != NULL) 
	{
		printf("\nRoll Number : %3d" , tp->rollNumber);	   
		printf("\nStudent Name : %s" , tp->name);
		
		tp = tp->nextNode ;
	}
}


void addNode() {

	Student *p;
	
	p = (Student *) malloc(sizeof(Student));
	
	
	printf("\nEnter roll number : ");
	scanf("%d" , &p->rollNumber);
	
	fflush(stdin);
	
	printf("\nEnter name : ");
	gets(p->name);
	
	p->nextNode = NULL; 
	
	if(first == NULL) {
	
		first = p;
		last = p;
		
		printf("\nFirst node added");
	
	} else {
	
		last->nextNode = p;
		last = p;
		
		printf("\nNew node added in the end of the linked list");
	}

}

void insertNode()
{
    int existingRoll;
    Student *p, *t, *pre = NULL;

    if(first == NULL)
    {
        printf("\nList is empty. Cannot insert.\n");
        return;
    }

    printf("\nEnter the existing roll number (before which to insert): ");
    scanf("%d", &existingRoll);
    fflush(stdin);

    t = first;

    /* Search for the roll number */
    while(t != NULL)
    {
        if(t->rollNumber == existingRoll)
            break;

        pre = t;
        t = t->nextNode;
    }

    if(t == NULL)
    {
        printf("\nRoll number not found!\n");
        return;
    }

    /* Allocate memory */
    p = (Student *) malloc(sizeof(Student));

    printf("\nEnter new roll number: ");
    scanf("%d", &p->rollNumber);
    fflush(stdin);

    printf("\nEnter name: ");
    gets(p->name);   

    /* Insert before first node */
    if(t == first)
    {
        p->nextNode = first;
        first = p;
    }
    else
    {
        p->nextNode = t;
        pre->nextNode = p;
    }

    printf("\nSuccessfully inserted before roll number %d\n", existingRoll);
}


void deleteNode() {

	Student *t = first , *pre = first;
	int rn;
	
	printf("\nRole Number to Delet ? : ");
	scanf("%d" , &rn);
	fflush(stdin);
	
	while(t != NULL)
	{	 
		/* find the node to delete */
		
		if(t->rollNumber == rn)
		{
			break;
		}
		pre =t;
		t = t->nextNode;
	}
	
	if(t == NULL) {
		printf("%d id not found in the student list.." , rn);
		return;
	}
		
	if(first == t) {
		
		first = t->nextNode;
	
	} else if(last == t){
	
		pre->nextNode = NULL;
		last = pre;
	
	}
	else {
		pre->nextNode = t->nextNode;	
	}
	
	printf("\n Successfully Deteletd...\n");
	
	free(t);

}

void searchNode() {

	
	Student *t = first , *pre = first;
	int rn;
	
	printf("\nRole Number to search? : ");
	scanf("%d" , &rn);
	fflush(stdin);
	
	while(t != NULL)
	{	 
		/* find the node to delete */
		
		if(t->rollNumber == rn)
		{
			printf("Roll number matched Student name %s" , t->name);
			break;
		}
		pre =t;
		t = t->nextNode;
	}
	
	if(t == NULL) {
		printf("%d roll number not found in the student list.." , rn);
		return;
	}

}

void writeFile() {

	Student *p = first;
	FILE *f;
	
	f = fopen("./student.dat","wb");
	
	while(p != NULL)
	{
	
		fwrite(p , sizeof(Student) , 1 , f);
		p = p->nextNode;
	}

	fclose(f);
}

void addNodeIntoMemory(int rollNumber , char *name)
{
	Student *p;
	
	p = (Student *) malloc(sizeof(Student));
	
	
 	p->rollNumber = rollNumber;
	strcpy(p->name ,name);
	
	if(first == NULL) {
	
		first = p;
		last = p;
		
		printf("\nNode loaded to memory");
	
	} else {
	
		last->nextNode = p;
		last = p;
		
		printf("\nNode loaded to memory");
	}

	
} 

void loadMemory() {

	Student s;
	FILE *f;
	
	f = fopen("./Student.dat" , "rb");
	
	if(f == NULL) return;
	
	while((fread(&s , sizeof(Student), 1 , f)) != 0)
	{
		addNodeIntoMemory(s.rollNumber , s.name);
	}
	

}

