/******************************************************************************

 a new string game lol | java assignment 14 | 31/05/2023-09/06/2023

 *******************************************************************************/
import java.util.Scanner;

public class ThIoseInPower011
{
    public static void main(String[] args) {
        int materials = 15; //amount of materials your kingdom has
        int money = 30; //amount of money your royal treasury has
        int citizens = 6000; //population count of your nation (1 point = 10 people)
        int army = 1000; //size of your army (1 point = 5 soldiers)
        int food = 80; //amount of food your nation has (1 point = 1 month of food)
        int auvia = 30;//alliance strength with the Republic of Auvia (%)
        int miara = 60;//alliance stength with the Kingdom of Miara (%) (NOT IN GAMEPLAY)
        int dravaro = 50;//alliance stength with the Dravaro Imperium (%) (NOT IN GAMEPLAY)
        int bolta = 90;//alliance strength with the Bolta Territories (NOT IN GAMEPLAY)
        int rothgar = 0;//alliance strength with the Empire of Low Rothgar (%)
        int church = 50;//alliance stength with the Church of the Sun (%)
        int approval = 85;//citizen approval rating of your rule (%)
        int choicesCount;//number of choices you made during the game/reign
        int epComp;//number of episodes you've completed

        System.out.println("reEngine 1.0"); //engine name

        try { //wait 2 seconds
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Dino Interactive presents"); //studios
        System.out.println("A Stegosoft West Game \n");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        //game name
        System.out.println("  _______ _                      _____         _____                       ");
        System.out.println(" |__   __| |                    |_   _|       |  __ \\                      ");
        System.out.println("    | |  | |__   ___  ___  ___    | |  _ __   | |__) |____      _____ _ __ ");
        System.out.println("    | |  | '_ \\ / _ \\/ __|/ _ \\   | | | '_ \\  |  ___/ _ \\ \\ /\\ / / _ \\ '__|");
        System.out.println("    | |  | | | | (_) \\__ \\  __/  _| |_| | | | | |  | (_) \\ V  V /  __/ |   ");
        System.out.println("    |_|  |_| |_|\\___/|___/\\___| |_____|_| |_| |_|   \\___/ \\_/\\_/ \\___|_|   ");

        System.out.println("    ____----____----____----____----____----____----____----____----____");

        System.out.println("\n \033[3mYour Choices Affect the Story of the Game\033[0m"); //disclaimer
        System.out.println("\n \033[1mThis game is in early alpha stages. Only basic gameplay is available.\033[0m"); //beta notice

        /******************************************************************************
         actual game play time
         *******************************************************************************/

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        Scanner a = new Scanner(System.in);
        System.out.println("What is your monarch's name? Don't your title to the front. Example: Bob");
        String a1 = a.nextLine();
        System.out.println("What is your title? Empress, Emperor, King, Queen, Tsar, whatever you want.");
        String a2 = a.nextLine();
        String name = a2 + " " + a1;
        choicesCount = 2;

        System.out.println("  ______  _____  ____  ______  _____  _____   ______   _____   ");
        System.out.println(" |   ___||     ||    ||   ___|/     \\|     \\ |   ___| |_    |  ");
        System.out.println(" |   ___||    _||    | `-.`-. |     ||      \\|   ___|  |    |  ");
        System.out.println(" |______||___|  |____||______|\\_____/|______/|______|  |____|  ");
        System.out.println(" The Royal Menace");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Newsboy: Hear ye, hear ye! The King has been dead for a week! His child, " + a1 + ", is now " + a2 + " of the Stellaris Empire!" );
        System.out.println(" Newsboy: The Coronation is today at noon! Hear ye, hear ye!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond, Right Hand to the " + a2 + ": " + a1 + ", I am so sorry for your loss. Your father and I were close.");
        System.out.println(" Harmond: Unfortunately, we do not have much time to mourn, we must do something abo-");

        try { //wait 4 seconds
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Commander Vrygun: THE AUVIANS ARE CAUSING HAVOC IN WESTERN REGIONS OF THE CAPITAL!");
        System.out.println(" Commander Vrygun: WE NEED TO SEND THE ARMY!");

        try { //wait 2 seconds
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond: We should see what they want first, we can't risk making them threatened enough to resort to violence!");

        try { //wait 2 seconds
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Commander Vrygun: How about our good " + a2 + " decide what to do here?");

        try { //wait 1 seconds
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nCHOICES: Attack OR Diplomacy (-5 Money)");
        System.out.println(materials + " Materials. " + money + " Money. " + army + " Army. \n" + food + " Food. " + citizens + " Citizens.");
        String a3 = a.nextLine();

        if ("attack".equalsIgnoreCase(a3)) {
            System.out.println("\n You: Send in the army, but do not fight!");
            System.out.println("The Republic of Auvia is now your enemy, and attack Stellaris, killing thoustands. You are ousted and banished and the people repair relations");

            try { //wait 4 seconds
                Thread.sleep(4000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n\033[1m__  __ ____  __ __     ____  _  ____  ____ \033[0m");
            System.out.println("\033[1m\\ \\/ // () \\|  |  |   | _) \\| || ===|| _) \\\033[0m");
            System.out.println("\033[1m |__| \\____/ \\___/    |____/|_||____||____/\033[0m");
            System.out.println("\n\033[3mRetry?\033[0m");
            System.exit(0);
            army = 990;
        } else if ("diplomacy".equalsIgnoreCase(a3)) {
            choicesCount = 3;
            System.out.println("\n You: I will try to reason with the Auvians. Commander, prepare for mobilisation if need be. Come Harmond");

            try { //wait 4 seconds
                Thread.sleep(4000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\nIN THE CITY ---");
            money = 25;

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n Auvian General: We wish to speak with the " + a2 + "! Now!");

            try { //wait 3 seconds
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n You: Hello there, I am the " + a2 + ", " + a1);
            System.out.println(" You: What brings you to Stellaris?");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n Auvian General: Hello, young " + a2 + ". I am General Tr'staeon.");
            System.out.println(" General Tr'staeon: We had an agreement with your father, you see, ");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println(" we Auvians rely on Stellaris for access to the Great Sea through the");
            System.out.println(" Marauder River, and we had a deal that gave us access again,");

            try { //wait 3 seconds
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println(" and past Stellaris monarchs often end and restart the deal to their own whims.");

            try { //wait 5 seconds
                Thread.sleep(5000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n General Tr'staeon: We ask of the Divine Crown to grant Auvia continued access while we hammer out a deal for your reign.");
            System.out.println("CHOICES: Agree (-1 Money, +30 Auvia Alliance strength) OR Disagree (-10% Alliance strength with Auvia");
            System.out.println(money + " Money. " + auvia + "% alliance strenth with Republic of Auvia.");

            String a4 = a.nextLine();

            if ("agree".equalsIgnoreCase(a4)) {
                auvia = 60;
                money = 24;
                choicesCount = 4;
                System.out.println("\n You: I agree to your terms, General. But please, next time, come to the castle!");

                try { //wait 3 seconds
                    Thread.sleep(3000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n General Tr'staeon: Ha, I will remember that! Thank you, " + name + ". Auvia will remember your benevolent actions.");
                System.out.println("\n General Tr'staeon: My men will set camp outside the city. I will see you at your coronation, your Highness!");

            } else if ("disagree".equalsIgnoreCase(a4)) {
                choicesCount = 4;
                System.out.println("\n You: Unfortunately, I am unable to promise that. But I will be fair at negotiations.");

                try { //wait 3 seconds
                    Thread.sleep(3000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n General Tr'staeon: Is this decision final?");

                try { //wait 3 seconds
                    Thread.sleep(3000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n You: Yes, General.");
                System.out.println("\n General Tr'staeon: Then I will try to make it not so and convince you! Riva, send word to the President!");

            }


        }
        System.out.println("BACK IN THE PALACE ---");
        System.out.println("\n Harmond: My " + a2 + ". Now that we've sorted out the situation with the Auvians,");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(" we must dicuss a matter of the upmost importance. Early this morning, while you were asleep");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(" you recieved an urgent letter from the north, from the Queen of Frissar, Namura.");

        System.out.println("\n Commander Vrygun: It details of a dark horde of wicked soldiers, who call themselves the people of Low Rothgar,");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(" and their plan to take control of the whole continent! According to my messengers, Frissar has been overrun by these warriors, and Queen Namura barely reached safety in Bolta!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println(" \n You: Wait, is this the same Rothgarians who attempted this same feat 60 years ago? They were supposed to be wiped out, Harmond, how can this be?");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n Commander Vrygun: Yes, my " + a2 + ". They are lead by the defeated king's grandson, King Gravos!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n You: We must summon the Court of Crowns, we cannot keep this to ourselves.");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n Harmond: It must wait for after your coronation, you must get ready, we haven't much time!");
        System.out.println("\n You: Bu-");

        System.out.println("  ______  _____  ____  ______  _____  _____   ______   ______  ");
        System.out.println(" |   ___||     ||    ||   ___|/     \\|     \\ |   ___| |____  | ");
        System.out.println(" |   ___||    _||    | `-.`-. |     ||      \\|   ___| |    --| ");
        System.out.println(" |______||___|  |____||______|\\_____/|______/|______| |______| ");
        System.out.println(" Attack of the Rothgarians");
        epComp = 1;

        try { //wait 5 seconds
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        System.out.println("\nAT THE ROYAL CATHEDRAL ---");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond: You look absolutely excellent, my " + a2 + ".");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: Thank you, Harmond. But we mu-");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Bishop Fildegard: HELLO YOUR MAGESTY! I hope you are prepared for the ceremony!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: I a-");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Bishop Fildegard: GOOD! Now- what is that?!?! That is not the traditional Robes of Coronation!!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: I think if I were to attempt to modernise the ceremonial outfits, it'd help the people expect me to be different-");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Bishop Fildegard: From your father? Well, I DON'T CARE! FIX THIS IMMEDIATELY! ");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nCHOICES: APOLOGIZE (+5 Church approval, +1 Public Approval) or REFUSE (-5 Church approval, +5 Public Approval");
        System.out.println(church + " Church Approval.");
        String a5 = a.nextLine();

        if ("apologize".equalsIgnoreCase(a5)) {
            church = 55;
            approval = 86;
            System.out.println("\n You: I apologize for this grave misdeed. I will change this immediately");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n Bishop Fildegard: That's what I thought. -- under breath: braindead fools, think that a crown gives them power -- ");
        } else if ("refuse".equalsIgnoreCase(a5)) {
            church = 45;
            approval = 90;
            System.out.println("\n You: I think not. I'm wearing the same crown, I am not suddenly unfit because I wear something else.");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n Pope Fildegard: WHY I NEVER! You are lucky the rest of the church approves of you!");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n Pope Fildegard: Because I certainly DO NOT! THE AUDACITY");

        }
        choicesCount = 5;
        System.out.println("\nTWO HOURS LATER ---");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Archbishop Hila: State thy name, royal one!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: " + a1 + " Mene-Helios of House Stellaris, First of Their Name, Saver of Souls, Steward of the People");
        System.out.println(" Child of the Deities, Supreme Head of the Church");

        try { //wait 4 seconds
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Archbishop Hila: With the power granted to me by thy forefathers, I declare you... ");
        System.out.println(" " + a2 + " of the Stellaris Empire, Ruler of the People of the Stars!");

        try { //wait 2 seconds
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Unknown Person: I OBJECT!");
        System.out.println("\n Archbishop Hila: Thou cannot reject the " + a2 + " of this nation! Whomst thou!?!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Unknown Person: Prince Karos, of King Gravos, of the Empire of the Low Rothgar! And I declare Stellaris, our vassel state!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: Claim whatever you like, does not make it true! Leave, Prince, while you are still unharmed!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Prince Karos: NEVER! -- charges towards you -- ");
        System.out.println("CHOICES: DODGE or KICK");
        String a6 = a.nextLine();

        if ("dodge".equalsIgnoreCase(a6)) {
            System.out.println("Successful Dodge!");

        } else if ("kick".equalsIgnoreCase(a6)) {
            System.out.println("Partially Successful Kick! Prince Karos staggered");
        }
        choicesCount = 6;

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond: Here, my " + a2 + ", the Starsmasher sword! -- throws to you --");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("You know have the Starsmasher sword, an enchanted blade used by many generations of royalty");

        try { //wait 4 seconds
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Commander Vrygun: They are attacking the capital, the army has been deployed!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond: I will evacuate the people from this cathedral!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Prince Karos: -- swings blade at you -- ");
        System.out.println("CHOICES: SLASH OR BLOCK");
        String a7 = a.nextLine();
        if ("slash".equalsIgnoreCase(a7)) {
            System.out.println("Failed Slash!");
            System.out.println("You slash at Prince Karos' torso, cutting through his chainmail shirt with ease!");
            System.out.println("But he swings his sword into your neck in a killing blow! You fall to the ground.");


            try { //wait 4 seconds
                Thread.sleep(4000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n\033[1m__  __ ____  __ __     ____  _  ____  ____ \033[0m");
            System.out.println("\033[1m\\ \\/ // () \\|  |  |   | _) \\| || ===|| _) \\\033[0m");
            System.out.println("\033[1m |__| \\____/ \\___/    |____/|_||____||____/\033[0m");
            System.out.println("\n\033[3mRetry?\033[0m");
            System.exit(0);

        } else if ("block".equalsIgnoreCase(a7)) {
            System.out.println("Successful Block!");
            System.out.println("You block Karos' attack! His sword shatters! You kick him onto his back!");
            System.out.println("You hold Starsmasher's tip to his neck!");
            choicesCount = 7;
        }

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n You: I offer you mercy or death, be careful which you decide, Karos.");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Prince Karos: I beg for death! If I live, my father will kill me anyway.");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Harmond: Lock him up in the dungeon! He may be useful!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Commander Vrygun: The Stellaris Guard have defeated the meager Rothgarian force!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println(" Commander Vrygun: As for this terrorist, send him back home! Let him face punishment for his foolishness!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n Archbishop Hila: No! Help Karos escape his father in the other continents! He is but a boy!");

        try { //wait 3 seconds
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("CHOICES: IMPRISON (-1 Public Approval, -1 Army, 0 Church) + or SEND HOME (+1 Public Approval, +3 Army, - 3 Church) or HELP (-1 Public Approval, -3 Army, +6 Church Approval)");
        System.out.println(approval + "% Public Approval. " + army + " Army Strength. " + church + "% Church Approval.");
        String a8 = a.nextLine();

        if ("imprison".equalsIgnoreCase(a8)) {
            approval = approval - 1;
            army = army - 1;
            System.out.println("\n You: I will imprison him in the dungeons for now.");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        } else if ("send home".equalsIgnoreCase(a8)) {
            approval = approval + 1;
            army = army + 3;
            church = church - 3;
            System.out.println("\n You: Send him and his remaining men back home, let their so-called king decide their fate");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        } else if ("help".equalsIgnoreCase(a8)) {
            approval = approval - 1;
            army = army - 3;
            church = church + 6;
            System.out.println("\n You: We shall assist him to get to Westeros, so he may realise the errors in his ways. He could be valuable.");

            try { //wait 3 seconds
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }
        epComp = 2;
        choicesCount = 8;
        System.out.println("That's the end of the alpha! Thanks for playing...");

        try { //wait 5 seconds
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("  _______ _                      _____         _____                       ");
        System.out.println(" |__   __| |                    |_   _|       |  __ \\                      ");
        System.out.println("    | |  | |__   ___  ___  ___    | |  _ __   | |__) |____      _____ _ __ ");
        System.out.println("    | |  | '_ \\ / _ \\/ __|/ _ \\   | | | '_ \\  |  ___/ _ \\ \\ /\\ / / _ \\ '__|");
        System.out.println("    | |  | | | | (_) \\__ \\  __/  _| |_| | | | | |  | (_) \\ V  V /  __/ |   ");
        System.out.println("    |_|  |_| |_|\\___/|___/\\___| |_____|_| |_| |_|   \\___/ \\_/\\_/ \\___|_|   ");

        try { //wait 4 seconds
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n\n --- FINAL STATS (only displays statics that changed during alpha gameplay) ---");
        System.out.println("Monarch Name: " + name + " Mene-Helios");
        System.out.println("Money in Treasury:" + money);
        System.out.println("Public Approval: " + approval + "%");
        System.out.println("Army Strength: " + army);
        System.out.println("Church approval: " + church + "%");
        System.out.println("Alliance Strength with Auvia: " + auvia + "%");
        System.out.println("Alliance Strength with Low Rothgar: " + rothgar + "%");
        System.out.println("Choices Made: " + choicesCount);
        System.out.println("Episodes Completed: " + epComp);
    }
}
