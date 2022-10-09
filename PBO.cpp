#include<iostream>
using namespace std;

//VITRI SEPTIA KIRANI
//2100018059
//KELAS A

int main(){
	int pilih;
	cout<<"ini merupakan program C++"<<endl;
	cout<<"==============================="<<endl;
	cout<<"1. perulangan FOR"<<endl;
	cout<<"2. Perulangan while"<<endl;
	cout<<"3. perulangan do-while"<<endl;
	cout<<"4. array 1Dimensi"<<endl;
	cout<<"5. array multidimensi"<<endl;
	cout<<"==============================="<<endl;
	cout<<"masukkan pilihan anda = "; cin>>pilih; //ini merupakan proses untuk memilih pilihan proses
	cout<<"-------------------------------"<<endl;
	switch (pilih){
		case 1: {//pilihan 1 merupakan proses menggunakan perulangan for
			int n;
			cout<<"==============================="<<endl;
			cout<<"ANDA MEMILIH PERULANGAN FOR"<<endl;
			cout<<"==============================="<<endl;
			cout<<"masukkan banyaknya perulangan = "; cin>>n; cout<<endl;//input untuk memasukan beberapa perulangan
			cout<<"---------------------------------"<<endl;
			for(int i=1; i<=n; i++){
				cout<<i<<" "; //output dari hasil perulangan menggunakan for
			}
			break;
		}
		case 2 : {
			int n;
			cout<<"==============================="<<endl;
			cout<<"ANDA MEMILIH PERULANGAN WHILE"<<endl;
			cout<<"==============================="<<endl;
			cout<<"masukkan banyaknya perulangan = "; cin>>n; cout<<endl;
			cout<<"---------------------------------"<<endl;
			int i=1;
			while(i<=n){
				cout<<i;//output hasil dari menggunakan perulangan while
				i++;
			}
			break;
		}
		case 3: {
			int n;
			cout<<"==============================="<<endl;
			cout<<"ANDA MEMILIH PERULANGAN DO-WHILE"<<endl;
			cout<<"==============================="<<endl;
			cout<<"masukkan banyaknya perulangan = "; cin>>n; cout<<endl;
			cout<<"---------------------------------"<<endl;
			int i=11;
			do{
				cout<<i<<endl;
				i++;
			}while(i<=n);
			cout<<"Nilai terakhir i = "<<i;// nilai akhir dari i menggunakan proses do-while
			break;
		}
		case 4: {//ini merupakan proses menggunakan 1 dimensi
			cout<<"==============================="<<endl;
			cout<<"ANDA MEMILIH ARRAY 1 DIMENSI"<<endl;
			cout<<"==============================="<<endl;
			int i[5]={1,2,3,4,5};//isi variabel dari 1 dimensi
			cout<<i[0]; cout<<" ";//output dari hasil 1 dimensi dari array ke 0-4
			cout<<i[1]; cout<<" ";
			cout<<i[2]; cout<<" ";
			cout<<i[3]; cout<<" ";
			cout<<i[4];
			break;
		}
		case 5: {//dimulti dimensi ini mneggunakan array 2 dimensi
			cout<<"==============================="<<endl;
			cout<<"ANDA MEMILIH ARRAY MULTIDIMENSI"<<endl;
			cout<<"==============================="<<endl;
			int i[2][2];//oanjang dari variabel/array
			i[0][0]=13;//isi dari variabel array
			i[0][1]=27;
			i[1][0]=10;
			i[1][1]=15;
			cout<<"isi variabel i :"<<endl;
			cout<<i[0][0]<<" "<<i[0][1]<<endl;//outout dari program
			cout<<i[1][0]<<" "<<i[1][1]<<endl;
			break;
		}
	}
}