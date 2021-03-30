package com.robert.listview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.SearchView

import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //search bar
        val search = findViewById<SearchView>(R.id.search_bar)
        val listvw = findViewById<ListView>(R.id.listview)
        val animalnames = arrayOf("Buffalo","Snake","Lion","Zebra","Monkey","Panda","Whale shark","Gorilla","Walrus")
        val adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,animalnames)
        listvw.adapter=adapter

        val x = ArrayList<animals>()

        search.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                search.clearFocus()
                val z = x.toArray()

                if(animalnames.contains(query)){
                    adapter.filter.filter(query)
                }else{
                    Toast.makeText(applicationContext,"Item not found", Toast.LENGTH_LONG).show()

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }

        })




        //list view

        x.add(animals(R.drawable.buffalo,"Buffalo","A buffalo is a large, ox-like animal with horns and shaggy fur. In North America, a buffalo is another name for a bison. "))
        x.add(animals(R.drawable.elephant,"Elephant","Elephants are the largest living land mammals and are two different species: the African elephant and the Asian elephant.Elephants usually only sleep two or three hours a day"))
        x.add(animals(R.drawable.lion,"Lion","The lion (Panthera leo) is a species in the family Felidae and a member of the genus Panthera. It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. "))
        x.add(animals(R.drawable.zebra,"Zebra","Zebras are African equines with distinctive black-and-white striped coats. There are three extant species: the Grévy's zebra (Equus grevyi), plains zebra (E. quagga), and the mountain zebra (E. zebra)."))
        x.add(animals(R.drawable.snake,"Snake","Some of the world’s largest snakes include the Green Anaconda, Burmese Python, and Reticulated Python, growing upwards of 18 feet.Some snakes are poisonous."))
        x.add(animals(R.drawable.monkey,"Monkey","Monkeys can be divided into Old World and New World monkeys and include ground-dwelling animals like baboons.The monkey is in the cage."))
        x.add(animals(R.drawable.panda,"Panda","Giant pandas are mammals that are only found in the wild in China, namely the Sichuan, Shaanxi, and Gansu provinces.Pandas are very clever."))
        x.add(animals(R.drawable.whaleshark,"Whale shark","Whale sharks are the largest type of shark with a length of 40 feet; their mouths are five feet wide, and they give birth to live young."))
        x.add(animals(R.drawable.gollilaa,"Gorilla","Gorillas are social animals that live in groups numbering from five to ten members. Their leader is a male known as a silverback."))
        x.add(animals(R.drawable.walrus,"Walrus","Walruses can be as long as 11.5 feet and weigh up to 1.5 tons. They use their tusks to pull themselves up onto land or ice from cold waters."))
        x.add(animals(R.drawable.leopard,"Leopard","Leopards are large spotted cats that are native to Africa and Asia. There are a total of nine recognized subspecies of leopards."))
        x.add(animals(R.drawable.wolf,"Wolf","Wolves can have hunting territories as large as 1,000 square miles. Their prey includes deer, bison, elk, moose, beavers, hares, and rodents."))
        x.add(animals(R.drawable.antelope,"Antelope","Antelope are even-toed hoofed mammals. There are a total of 91 known species referred to as “antelopes”, but they are not taxonomically related."))
        x.add(animals(R.drawable.baldeagle,"Bald Eagle","The Bald Eagle has a wide range that spans from Alaska in the west to Labrador Island in the east, from northern Canada to Northern Mexico.The bald eagle is a noble bird, both beautiful and majestic" ))
        x.add(animals(R.drawable.jellyfish,"Jellyfish","Jellyfish have bodies that are 95 percent water. They do not have hearts or brains, but have a nervous system that detects light."))
        x.add(animals(R.drawable.crab,"Crab","Most of the time, crabs walk from side to side, however, some species (like the common spider crab) can move forward and backward.A crab nipped my toe while I was paddling."))
        x.add(animals(R.drawable.giraffe,"Giraffe","Adult giraffes can be as tall as 18.7 feet. Giraffes eat 16 to 20 hours a day and can consume up to 30 pounds of food daily."))
        x.add(animals(R.drawable.came4,"Camel","Camels with one hump are known as Dromedaries, while camels with two humps are known as Bactrian camels."))
        x.add(animals(R.drawable.starfish,"Starfish","Starfish are known to regenerate their limbs if they lose them. Their digestive system extends from a central disc into their arms.If a starfish loses a leg, it grows back" ))
        x.add(animals(R.drawable.koala02,"Koala","Koalas are marsupials, meaning that they give birth to underdeveloped live young who live in pouches until they are mature enough to leave.The koala is listed among Australia’s endangered animals."))
        x.add(animals(R.drawable.alligator,"Alligator","Alligators are large reptiles that can grow from 8.2 to 11.2 feet in length. Their teeth are lost and replaced throughout their lifetime.The shoes are made of alligator skin."))
        x.add(animals(R.drawable.owl,"Owl","Owls are nocturnal birds of prey. They can be as large as the Great Horned Owl (900 – 2500 grams) or as small as the Elf Owl (45 grams).Owls hunt at night."))
        x.add(animals(R.drawable.tiger,"Tiger","The Bengal Tiger is a tiger native to Nepal, Bhutan, Bangladesh, and India. It is a large tiger, weighing between 308 and 490 pounds.Lions and tigers are called big cats."))
        x.add(animals(R.drawable.bear,"Bear","There are eight species of bear in the world, and they live in habitats ranging from South America to North America, and southern and eastern Asia."))
        x.add(animals(R.drawable.bluewhale,"Blue Whale","The Blue Whale is the largest animal on earth and is considered the largest animal ever to have existed. It is 100 feet long and weighs 200 tons."))
        x.add(animals(R.drawable.coyote,"Coyote","Coyotes are a wide-ranging canine species that have a diverse diet, eating anything from moose and bison to lizards and insects.Coyote tracks are similar to dog tracks."))
        x.add(animals(R.drawable.chimpanzee,"Chimpanzee","The chimpanzee is the human being’s closest living relative. 98.8. percent of its DNA is similar to that of humans. The chimpanzee is an endangered species."))
        x.add(animals(R.drawable.racoon,"Raccoon","Raccoons are nocturnal animals that are solitary, except for the months between January and June, their mating season. A raccoon came to the river and found a fish to eat."))
        x.add(animals(R.drawable.articwolf,"Arctic Wolf","The Arctic Wolf is native to the North American arctic and Greenland. It subsists on elk, musk oxen, and arctic hares."))
        x.add(animals(R.drawable.crocodiles,"Crocodile","Crocodiles are cold-blooded aquatic reptiles that live in tropical areas of the Americas, Australia, Africa, and Asia. Crocodiles have sharp teeth."))
        x.add(animals(R.drawable.squirrel,"Squirrel","Squirrels can not digest cellulose, and therefore usually feed on nuts, coniferous cones, and seeds. Squirrels eat seeds and nuts, as well as insects and mushrooms."))
        x.add(animals(R.drawable.kangaroo,"Kangaroo","Kangaroos are native to Australia and frequent the country’s grasslands, plains, beaches, and even golf courses. A female kangaroo carries its young in the pouch."))
        x.add(animals(R.drawable.hippopotamus,"Hippopotamus","An adult hippopotamus can weigh as much as 9,920 pounds and be 16.5 feet in length.The children enjoyed watching the hippopotamus wallowing in the mud."))
        x.add(animals(R.drawable.elk,"Elk","Elk are native to North America, weigh up to 1,100 pounds, and can be larger than five feet tall at the shoulder"))
        x.add(animals(R.drawable.rabbit,"Rabbit","Rabbits sleep on average about 8.4 hours a day and sleep with their eyes open to respond to sudden outside movements."))
        x.add(animals(R.drawable.bat,"Bat","Bats are the only true flying mammals. Their wings are comprised of thin bones and a stretchy skin membrane.A bat is not a bird, but a mammal."))
        x.add(animals(R.drawable.hare,"Hare","Hares are different from rabbits in that they have larger ears, live solitary or paired social lives, and are self-sufficient from birth.It is not easy to catch a hare with your bare hands."))
        x.add(animals(R.drawable.toad,"Toad","Toads are not taxonomically different from frogs, because of their appearance they are colloquially referred to as separate types of animals.The toad has changed its colour to blend in with its new environment."))
        x.add(animals(R.drawable.frog1, "Frog","Frogs are amphibians of the Anura order of animals. They start life as eggs, then change into tadpoles, and eventually their adult form.The frog plopped into the pond."))
        x.add(animals(R.drawable.deer, "Deer","Deer are part of the Artiodactyla order of animals. They are native to Europe, Asia, Africa, and the Americas, and have been introduced to Australia."))
        x.add(animals(R.drawable.lizard, "Lizard","Lizards are a large group of reptiles that typically have scales, a small head, and short limbs. Some lizards do not have limbs and resemble snakes."))
        x.add(animals(R.drawable.mole, "Mole","Moles are burrowing mammals that are capable of digging 15 to 18 feet of tunnels in an hour. They mostly eat earthworms and insects."))
        val y = AnimalAdapter(this,x)


        val listv = findViewById<ListView>(R.id.listview)
        listv.adapter = y
    }
    class AnimalAdapter: BaseAdapter {
        var x:Context? = null
        var y:ArrayList<animals>? = null
        constructor(a:Context,b:ArrayList<animals>):super(){
            this.x = a
            this.y = b
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
          val pan = x?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val p = pan.inflate(R.layout.list,null)
            val img = p.findViewById<ImageView>(R.id.Image)
            val txt1 = p.findViewById<TextView>(R.id.text1)
            val txt2 = p.findViewById<TextView>(R.id.text3)
            txt1.text = y!![position].name
            txt2.text = y!![position].desc
            img.setImageResource(y!![position].image!!)
//            p.setOnClickListener{
//                val intent = Intent(x,AnimalInfo::class.java)
//                intent.putExtra("name", y!![position].name)
//                intent.putExtra("desc",y!![position].desc)
//                intent.putExtra("image", y!![position].image)
//                x!!.startActivity(intent)
//            }
            return p
        }

        override fun getItem(position: Int): Any {
         return y!![position]
        }

        override fun getItemId(position: Int): Long {
         return position.toLong()
        }

        override fun getCount(): Int {

          return y!!.size
        }

    }

}