package com.company;



// Created on Mar 8 ,2018
// Program is about Players vs Monsters
// Coder of program is 9 years old
// Monsters are battled wave by wave
// The monster's health and damage is set
// Monsters get stronger by each wave
// First mini game created by coder at age of 9

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Creating player
        Game game = new Game();

        String name;
        int playerHealth;

        int poisonTurns = 0;
        int poisonTurns1 = 0;

        int gun = 0;
        int sword = 0;
        int bomb = 0;
        int diamondBomb = 0;


        System.out.println("Enter new player name:");
        name = scanner.nextLine();
        System.out.println("Enter player health(From 1 to 17400)");

        playerHealth = scanner.nextInt();
        final int playerHealth1 = playerHealth;
        if (playerHealth > 17400 || playerHealth < 0) {

            System.out.println("Invalid health. Your health is now set to 14400.");
            playerHealth = 14400;
        }




        game.startingPlayer(name, playerHealth);
        // Battling Werewolf 00000000000000000000000000000000000000000000000000000000000000000000000
        int monsterHealth = 8900;
        int monsterDamage = 400;
        String monsterName = "Werewolf";

        boolean gameOver = false;
        System.out.println("Now battling monster " + monsterName + "! ");
        System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
        while (!gameOver) {

            System.out.println("Enter player action(0 to attack , 1 to heal)");
            int action = scanner.nextInt();
            if (action == 0) {

                System.out.println( "Enter the weapon you want to use:");
                System.out.println("Press 0 to select gun.(1800 damage)");
                System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                int selectWeapon1 = scanner.nextInt();
                if (selectWeapon1 == 0) {
                    monsterHealth -= 1800;
                    gun ++;
                } else if (selectWeapon1 == 1) {
                    monsterHealth -= 3000;
                    playerHealth -= 600;
                    System.out.println("You were too close to the enemy with a sword! " +
                            "You lost 600 health! You now have " + playerHealth +
                            " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                    if (playerHealth < 0) {
                        System.out.println("Game Over!");
                        System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                        gameOver = true;
                        break;

                    }
                    sword ++;
                } else if (selectWeapon1 == 2) {
                    monsterHealth -= 4400;
                    playerHealth -= 1600;
                    System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                            " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                    if (playerHealth < 0) {
                        System.out.println("Game Over!");
                        System.out.println("Player " + name + " blew up");
                        gameOver = true;
                        break;

                    }
                    bomb ++;
                } else if (selectWeapon1 == 3) {
                    monsterHealth -= 8400;
                    playerHealth -= 4100;
                    System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                            " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                    if (playerHealth < 0) {
                        System.out.println("Game Over!");
                        System.out.println("Player " + name + " blew up");
                        gameOver = true;
                        break;

                    }

                    diamondBomb++;
                }
                if (monsterHealth <= 0) {
                    gameOver = true;

                    System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                } else {
                    System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                            " health remaining!");
                }
            } else if (action == 1) {
                playerHealth += 4000;
                if (playerHealth > playerHealth1) {
                    playerHealth = playerHealth1;
                    System.out.println("Player " + name + " is at full health!" +
                            " Your health is " + playerHealth + "/" + playerHealth1);
                } else {
                    System.out.println("Player " + name + " now has " + playerHealth + " health!");
                }
            }


            if (monsterHealth <= 0)
                gameOver = true;
            if (monsterHealth > 0) {

                playerHealth -= monsterDamage;

                if (playerHealth <= 0) {
                    System.out.println("Monster " + monsterName + " killed you! You have battled to the 1st wave!");
                    gameOver = true;
                } else {
                    System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                }



            }

        }
        //Battling Spider ====================================================================================================================================
        if (playerHealth > 0) {
            monsterHealth = 10900;
            monsterDamage = 640;
            monsterName = "Spider";

            gameOver = false;
            System.out.println("Now battling monster " + monsterName + "! ");
            System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
            while (!gameOver) {

                System.out.println("Enter player action(0 to attack , 1 to heal)");
                int action1 = scanner.nextInt();
                if (action1 == 0) {
                    System.out.println( "Enter the weapon you want to use:");
                    System.out.println("Press 0 to select gun.(1800 damage)");
                    System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                    System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                    System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                    int selectWeapon1 = scanner.nextInt();
                    if (selectWeapon1 == 0) {
                        monsterHealth -= 1800;
                        gun ++;
                    } else if (selectWeapon1 == 1) {
                        monsterHealth -= 3000;
                        playerHealth -= 600;
                        System.out.println("You were too close to the enemy with a sword! " +
                                "You lost 600 health! You now have " + playerHealth +
                                " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                        if (playerHealth < 0) {
                            System.out.println("Game Over!");
                            System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                            gameOver = true;
                            break;

                        }
                        sword ++;
                    } else if (selectWeapon1 == 2) {
                        monsterHealth -= 4400;
                        playerHealth -= 1600;
                        System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                        if (playerHealth < 0) {
                            System.out.println("Game Over!");
                            System.out.println("Player " + name + " blew up");
                            gameOver = true;
                            break;

                        }
                        bomb ++;
                    } else if (selectWeapon1 == 3) {
                        monsterHealth -= 8400;
                        playerHealth -= 4100;
                        System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                        if (playerHealth < 0) {
                            System.out.println("Game Over!");
                            System.out.println("Player " + name + " blew up");
                            gameOver = true;
                            break;

                        }

                        diamondBomb++;
                    }

                    if (monsterHealth <= 0) {
                        gameOver = true;
                        System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                    } else {
                        System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                " health remaining!");
                    }
                } else if (action1 == 1) {
                    playerHealth += 4000;
                    if (playerHealth > playerHealth1) {
                        playerHealth = playerHealth1;
                        System.out.println("Player " + name + " is at full health!" +
                                " Your health is " + playerHealth + "/" + playerHealth1);
                    } else {
                        System.out.println("Player " + name + " now has " + playerHealth + " health!");
                    }
                }
                if (monsterHealth <= 0)
                    gameOver = true;
                if (monsterHealth > 0) {

                    playerHealth -= monsterDamage;

                    if (playerHealth <= 0) {
                        System.out.println("Player " + name + " was killed by monster " + monsterName);
                        System.out.println("Monster " + monsterName + " killed you! You have battled to the 2nd wave!");
                        gameOver = true;
                    } else {
                        System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                    }

                }

            }
            //Battling Zombie ====================================================================================================================================
            if (playerHealth > 0) {
                monsterHealth = 12400;
                monsterDamage = 870;
                monsterName = "Zombie";

                gameOver = false;
                System.out.println("Now battling monster " + monsterName + "! ");
                System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
                while (!gameOver) {

                    System.out.println("Enter player action(0 to attack , 1 to heal)");
                    int action5 = scanner.nextInt();
                    if (action5 == 0) {
                        System.out.println( "Enter the weapon you want to use:");
                        System.out.println("Press 0 to select gun.(1800 damage)");
                        System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                        System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                        System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                        int selectWeapon1 = scanner.nextInt();
                        if (selectWeapon1 == 0) {
                            monsterHealth -= 1800;
                            gun ++;
                        } else if (selectWeapon1 == 1) {
                            monsterHealth -= 3000;
                            playerHealth -= 600;
                            System.out.println("You were too close to the enemy with a sword! " +
                                    "You lost 600 health! You now have " + playerHealth +
                                    " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                            if (playerHealth < 0) {
                                System.out.println("Game Over!");
                                System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                gameOver = true;
                                break;

                            }
                            sword ++;
                        } else if (selectWeapon1 == 2) {
                            monsterHealth -= 4400;
                            playerHealth -= 1600;
                            System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                    " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                            if (playerHealth < 0) {
                                System.out.println("Game Over!");
                                System.out.println("Player " + name + " blew up");
                                gameOver = true;
                                break;

                            }
                            bomb ++;
                        } else if (selectWeapon1 == 3) {
                            monsterHealth -= 8400;
                            playerHealth -= 4100;
                            System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                    " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                            if (playerHealth < 0) {
                                System.out.println("Game Over!");
                                System.out.println("Player " + name + " blew up");
                                gameOver = true;
                                break;

                            }

                            diamondBomb++;
                        }


                        if (monsterHealth <= 0) {
                            gameOver = true;
                            System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                        } else {
                            System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                    " health remaining!");
                        }
                    } else if (action5 == 1) {
                        playerHealth += 4000;
                        if (playerHealth > playerHealth1) {
                            playerHealth = playerHealth1;
                            System.out.println("Player " + name + " is at full health!" +
                                    " Your health is " + playerHealth + "/" + playerHealth1);
                        } else {
                            System.out.println("Player " + name + " now has " + playerHealth + " health!");
                        }
                    }
                    if (monsterHealth <= 0)
                        gameOver = true;
                    if (monsterHealth > 0) {

                        playerHealth -= monsterDamage;

                        if (playerHealth <= 0) {
                            System.out.println("Monster " + monsterName + " killed you! You have battled to the 3rd wave!");
                            gameOver = true;
                        } else {
                            System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                        }

                    }
                }
                //Battling King of Monsters ====================================================================================================================================
                if (playerHealth > 0) {
                    monsterHealth = 16400;
                    monsterDamage = 1470;
                    monsterName = "King of Monsters";

                    gameOver = false;
                    System.out.println("Now battling monster " + monsterName + "! ");
                    System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
                    while (!gameOver) {

                        System.out.println("Enter player action(0 to attack , 1 to heal)");
                        int action2 = scanner.nextInt();
                        if (action2 == 0) {
                            System.out.println( "Enter the weapon you want to use:");
                            System.out.println("Press 0 to select gun.(1800 damage)");
                            System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                            System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                            System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                            int selectWeapon1 = scanner.nextInt();
                            if (selectWeapon1 == 0) {
                                monsterHealth -= 1800;
                                gun ++;
                            } else if (selectWeapon1 == 1) {
                                monsterHealth -= 3000;
                                playerHealth -= 600;
                                System.out.println("You were too close to the enemy with a sword! " +
                                        "You lost 600 health! You now have " + playerHealth +
                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                if (playerHealth < 0) {
                                    System.out.println("Game Over!");
                                    System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                    gameOver = true;
                                    break;

                                }
                                sword ++;
                            } else if (selectWeapon1 == 2) {
                                monsterHealth -= 4400;
                                playerHealth -= 1600;
                                System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                if (playerHealth < 0) {
                                    System.out.println("Game Over!");
                                    System.out.println("Player " + name + " blew up");
                                    gameOver = true;
                                    break;

                                }
                                bomb ++;
                            } else if (selectWeapon1 == 3) {
                                monsterHealth -= 8400;
                                playerHealth -= 4100;
                                System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                        " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                if (playerHealth < 0) {
                                    System.out.println("Game Over!");
                                    System.out.println("Player " + name + " blew up");
                                    gameOver = true;
                                    break;

                                }

                                diamondBomb++;
                            }
                            if (monsterHealth <= 0) {
                                gameOver = true;
                                System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                            } else {
                                System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                        " health remaining!");
                            }
                        } else if (action2 == 1) {
                            playerHealth += 4000;
                            if (playerHealth > playerHealth1) {
                                playerHealth = playerHealth1;
                                System.out.println("Player " + name + " is at full health!" +
                                        " Your health is " + playerHealth + "/" + playerHealth1);
                            } else {
                                System.out.println("Player " + name + " now has " + playerHealth + " health!");
                            }
                        }
                        if (monsterHealth <= 0)
                            gameOver = true;
                        if (monsterHealth > 0) {

                            playerHealth -= monsterDamage;

                            if (playerHealth <= 0) {
                                System.out.println("Player " + name + " was killed by monster " + monsterName);
                                System.out.println("Monster " + monsterName + " killed you! You have battled to the 4th wave!");
                                gameOver = true;
                            } else {
                                System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                            }

                        }

                    }
                    //Battling Robot Warrior ====================================================================================================================================
                    if (playerHealth > 0) {
                        monsterHealth = 30400;
                        monsterDamage = 1770;
                        monsterName = "Robot Warrior";

                        gameOver = false;
                        System.out.println("Now battling monster " + monsterName + "! ");
                        System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
                        while (!gameOver) {

                            System.out.println("Enter player action(0 to attack , 1 to heal)");
                            int action3 = scanner.nextInt();
                            if (action3 == 0) {
                                System.out.println( "Enter the weapon you want to use:");
                                System.out.println("Press 0 to select gun.(1800 damage)");
                                System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                                System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                                System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                                System.out.println("Press 4 to select poison bomb.(900 damage,2400 damage for next two turns)");
                                int selectWeapon1 = scanner.nextInt();
                                if (selectWeapon1 == 0) {
                                    monsterHealth -= 1800;
                                    gun ++;
                                } else if (selectWeapon1 == 1) {
                                    monsterHealth -= 3000;
                                    playerHealth -= 600;
                                    System.out.println("You were too close to the enemy with a sword! " +
                                            "You lost 600 health! You now have " + playerHealth +
                                            " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                    if (playerHealth < 0) {
                                        System.out.println("Game Over!");
                                        System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                        gameOver = true;
                                        break;

                                    }
                                    sword ++;
                                } else if (selectWeapon1 == 2) {
                                    monsterHealth -= 4400;
                                    playerHealth -= 1600;
                                    System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                            " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                    if (playerHealth < 0) {
                                        System.out.println("Game Over!");
                                        System.out.println("Player " + name + " blew up");
                                        gameOver = true;
                                        break;

                                    }
                                    bomb ++;
                                } else if (selectWeapon1 == 3) {
                                    monsterHealth -= 8400;
                                    playerHealth -= 4100;
                                    System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                            " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                    if (playerHealth < 0) {
                                        System.out.println("Game Over!");
                                        System.out.println("Player " + name + " blew up");
                                        gameOver = true;
                                        break;

                                    }

                                    diamondBomb++;
                                }

                                if (monsterHealth <= 0) {
                                    gameOver = true;
                                    System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                                } else {
                                    System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                            " health remaining!");
                                }
                            } else if (action3 == 1) {
                                playerHealth += 4000;
                                if (playerHealth > playerHealth1) {
                                    playerHealth = playerHealth1;
                                    System.out.println("Player " + name + " is at full health!" +
                                            " Your health is " + playerHealth + "/" + playerHealth1);
                                } else {
                                    System.out.println("Player " + name + " now has " + playerHealth + " health!");
                                }
                            }
                            if (monsterHealth <= 0)
                                gameOver = true;
                            if (monsterHealth > 0) {

                                playerHealth -= monsterDamage;

                                if (playerHealth <= 0) {
                                    System.out.println("Player " + name + " was killed by monster " + monsterName);
                                    System.out.println("Monster " + monsterName + " killed you! You have battled to the 5th wave!");
                                    gameOver = true;
                                } else {
                                    System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                                }

                            }
                        }

                        //Battling Laser Bot ========================================================================
                        if (playerHealth > 0) {
                            monsterHealth = 36400;
                            monsterDamage = 9400;
                            monsterName = "Laser Bot";

                            gameOver = false;
                            System.out.println("Now battling monster " + monsterName + "! ");
                            System.out.println("Monster " + monsterName + " has " + monsterHealth + " health and a damage of " + monsterDamage);
                            while (!gameOver) {

                                System.out.println("Enter player action(0 to attack , 1 to heal)");
                                int action3 = scanner.nextInt();
                                if (action3 == 0) {
                                    System.out.println("Enter the weapon you want to use:");
                                    System.out.println("Press 0 to select gun.(1800 damage)");
                                    System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                                    System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                                    System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                                    System.out.println("Press 4 to select poison bomb.(900 damage,2400 damage for next two turns)");
                                    int selectWeapon1 = scanner.nextInt();
                                    if (selectWeapon1 == 0) {
                                        monsterHealth -= 1800;
                                        gun++;
                                    } else if (selectWeapon1 == 1) {
                                        monsterHealth -= 3000;
                                        playerHealth -= 600;
                                        System.out.println("You were too close to the enemy with a sword! " +
                                                "You lost 600 health! You now have " + playerHealth +
                                                " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                        if (playerHealth < 0) {
                                            System.out.println("Game Over!");
                                            System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                            gameOver = true;
                                            break;

                                        }
                                        sword++;
                                    } else if (selectWeapon1 == 2) {
                                        monsterHealth -= 4400;
                                        playerHealth -= 1600;
                                        System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                                " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                        if (playerHealth < 0) {
                                            System.out.println("Game Over!");
                                            System.out.println("Player " + name + " blew up");
                                            gameOver = true;
                                            break;

                                        }
                                        bomb++;
                                    } else if (selectWeapon1 == 3) {
                                        monsterHealth -= 8400;
                                        playerHealth -= 4100;
                                        System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                                " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                        if (playerHealth < 0) {
                                            System.out.println("Game Over!");
                                            System.out.println("Player " + name + " blew up");
                                            gameOver = true;
                                            break;

                                        }

                                        diamondBomb++;
                                    }


                                    if (monsterHealth <= 0) {
                                        gameOver = true;
                                        System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
                                    } else {
                                        System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                                " health remaining!");
                                    }
                                } else if (action3 == 1) {
                                    playerHealth += 4000;
                                    if (playerHealth > playerHealth1) {
                                        playerHealth = playerHealth1;
                                        System.out.println("Player " + name + " is at full health!" +
                                                " Your health is " + playerHealth + "/" + playerHealth1);
                                    } else {
                                        System.out.println("Player " + name + " now has " + playerHealth + " health!");
                                    }
                                }

                                if (monsterHealth < 0 || playerHealth < 0) {
                                    System.out.println("Monster Laser Bot is at his 1st charge!");//First Charge ============================================================

                                    System.out.println("Enter player action(0 to attack , 1 to heal)");
                                    action3 = scanner.nextInt();
                                    if (action3 == 0) {
                                        System.out.println("Enter the weapon you want to use:");
                                        System.out.println("Press 0 to select gun.(1800 damage)");
                                        System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                                        System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                                        System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                                        System.out.println("Press 4 to select poison bomb.(900 damage,2400 damage for next two turns)");
                                        int selectWeapon1 = scanner.nextInt();
                                        if (selectWeapon1 == 0) {
                                            monsterHealth -= 1800;
                                        } else if (selectWeapon1 == 1) {
                                            monsterHealth -= 3000;
                                            playerHealth -= 600;
                                            System.out.println("You were too close to the enemy with a sword! " +
                                                    "You lost 600 health! You now have " + playerHealth +
                                                    " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                            if (playerHealth < 0) {
                                                System.out.println("Game Over!");
                                                System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                                gameOver = true;
                                                break;

                                            }
                                        } else if (selectWeapon1 == 2) {
                                            monsterHealth -= 4400;
                                            playerHealth -= 1600;
                                            System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                                    " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                            if (playerHealth < 0) {
                                                System.out.println("Game Over!");
                                                System.out.println("Player " + name + " blew up");
                                                gameOver = true;
                                                break;

                                            }
                                        } else if (selectWeapon1 == 3) {
                                            monsterHealth -= 8400;
                                            playerHealth -= 4100;
                                            System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                                    " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                            if (playerHealth < 0) {
                                                System.out.println("Game Over!");
                                                System.out.println("Player " + name + " blew up");
                                                gameOver = true;
                                                break;

                                            }

                                        }


                                        if (monsterHealth <= 0) {
                                            gameOver = true;
                                            System.out.println("You killed all the monsters! Congratulations!");
                                        } else {
                                            System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                                    " health remaining!");
                                        }
                                    } else if (action3 == 1) {
                                        playerHealth += 4000;
                                        if (playerHealth > playerHealth1) {
                                            playerHealth = playerHealth1;
                                            System.out.println("Player " + name + " is at full health!" +
                                                    " Your health is " + playerHealth + "/" + playerHealth1);
                                        } else {
                                            System.out.println("Player " + name + " now has " + playerHealth + " health!");
                                        }
                                    }

                                    System.out.println("Monster Laser Bot is at his 2nd charge!");//Second Charge ============================================================

                                    if (monsterHealth < 0 || playerHealth < 0) {
                                        System.out.println("Enter player action(0 to attack , 1 to heal)");
                                        action3 = scanner.nextInt();
                                        if (action3 == 0) {
                                            System.out.println("Enter the weapon you want to use:");
                                            System.out.println("Press 0 to select gun.(1800 damage)");
                                            System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                                            System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                                            System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                                            System.out.println("Press 4 to select poison bomb.(900 damage,2400 damage for next two turns)");
                                            int selectWeapon1 = scanner.nextInt();
                                            if (selectWeapon1 == 0) {
                                                monsterHealth -= 1800;
                                                gun++;
                                            } else if (selectWeapon1 == 1) {
                                                monsterHealth -= 3000;
                                                playerHealth -= 600;
                                                System.out.println("You were too close to the enemy with a sword! " +
                                                        "You lost 600 health! You now have " + playerHealth +
                                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                                    gameOver = true;
                                                    break;

                                                }
                                                sword++;
                                            } else if (selectWeapon1 == 2) {
                                                monsterHealth -= 4400;
                                                playerHealth -= 1600;
                                                System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " blew up");
                                                    gameOver = true;
                                                    break;

                                                }
                                                bomb++;
                                            } else if (selectWeapon1 == 3) {
                                                monsterHealth -= 8400;
                                                playerHealth -= 4100;
                                                System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                                        " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " blew up");
                                                    gameOver = true;
                                                    break;

                                                }

                                                diamondBomb++;
                                            }
                                            if (monsterHealth <= 0) {
                                                gameOver = true;
                                                System.out.println("You killed all the monsters! Congratulations!");
                                            } else {
                                                System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                                        " health remaining!");
                                            }
                                        } else if (action3 == 1) {
                                            playerHealth += 4000;
                                            if (playerHealth > playerHealth1) {
                                                playerHealth = playerHealth1;
                                                System.out.println("Player " + name + " is at full health!" +
                                                        " Your health is " + playerHealth + "/" + playerHealth1);
                                            } else {
                                                System.out.println("Player " + name + " now has " + playerHealth + " health!");
                                            }
                                        }
                                        System.out.println("Monster Laser Bot is at his 3rd charge! Get ready for his 9400 damage attack.......");//Third Charge ============================================================

                                        System.out.println("Enter player action(0 to attack , 1 to heal)");
                                        action3 = scanner.nextInt();
                                        if (action3 == 0) {
                                            System.out.println("Enter the weapon you want to use:");
                                            System.out.println("Press 0 to select gun.(1800 damage)");
                                            System.out.println("Press 1 to select diamond sword.(3000 damage, 600 return damage)");
                                            System.out.println("Press 2 to select bomb.(4400 damage, 1600 return damage)");
                                            System.out.println("Press 3 to select diamond grenade bomb.(8400 damage, 4100 return damage)");
                                            System.out.println("Press 4 to select poison bomb.(900 damage,2400 damage for next two turns)");
                                            int selectWeapon1 = scanner.nextInt();
                                            if (selectWeapon1 == 0) {
                                                monsterHealth -= 1800;
                                                gun++;
                                            } else if (selectWeapon1 == 1) {
                                                monsterHealth -= 3000;
                                                playerHealth -= 600;
                                                System.out.println("You were too close to the enemy with a sword! " +
                                                        "You lost 600 health! You now have " + playerHealth +
                                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " got too close too the enemy with a diamond sword!");
                                                    gameOver = true;
                                                    break;

                                                }
                                                sword++;
                                            } else if (selectWeapon1 == 2) {
                                                monsterHealth -= 4400;
                                                playerHealth -= 1600;
                                                System.out.println("You took 1600 damage from the bomb! You now have " + playerHealth +
                                                        " remaining! " + monsterName + " has " + monsterHealth + " health remaining!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " blew up");
                                                    gameOver = true;
                                                    break;

                                                }
                                                bomb++;
                                            } else if (selectWeapon1 == 3) {
                                                monsterHealth -= 8400;
                                                playerHealth -= 4100;
                                                System.out.println("You took 4100 damage from the diamond grenade bomb! You have " + playerHealth + " health left!" +
                                                        " Monster " + monsterName + " took 8400 damage! Monster " + monsterName + " now has " + monsterHealth + " health left!");
                                                if (playerHealth < 0) {
                                                    System.out.println("Game Over!");
                                                    System.out.println("Player " + name + " blew up");
                                                    gameOver = true;
                                                    break;

                                                }

                                                diamondBomb++;
                                            }

                                            if (monsterHealth < 0 || playerHealth < 0) {
                                                if (monsterHealth <= 0) {
                                                    gameOver = true;
                                                    System.out.println("You killed all the monsters! Congratulations!");
                                                } else {
                                                    System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
                                                            " health remaining!");
                                                }
                                            } else if (action3 == 1) {
                                                playerHealth += 4000;
                                                if (playerHealth > playerHealth1) {
                                                    playerHealth = playerHealth1;
                                                    System.out.println("Player " + name + " is at full health!" +
                                                            " Your health is " + playerHealth + "/" + playerHealth1);
                                                } else {
                                                    System.out.println("Player " + name + " now has " + playerHealth + " health!");
                                                }
                                            }

                                            if (monsterHealth <= 0)
                                                gameOver = true;
                                            if (monsterHealth > 0) {

                                                playerHealth -= monsterDamage;

                                                if (playerHealth <= 0) {
                                                    System.out.println("Player " + name + " was killed by monster " + monsterName);
                                                    System.out.println("Monster " + monsterName + " killed you! You have battled to the 6th wave!");
                                                    gameOver = true;
                                                } else {
                                                    System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");

                                                }

                                            }
                                        }


//            monsterHealth = 2400;
//            monsterDamage = 440;
//            monsterName = "Spider";
//
//            gameOver = false;
//
//            while (!gameOver) {
//                System.out.println("Now battling monster " + monsterName + "! ");
//                System.out.println("Enter player action(0 to attack , 1 to heal");
//                 int action = scanner.nextInt();
//                if (action == 0){
//                    monsterHealth -= playerDamage;
//
//                    if (monsterHealth <= 0) {
//                        gameOver = true;
//                        System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
//                    }else {
//                        System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
//                                " health remaining!");
//                    }
//                }else if (action == 1){
//                    playerHealth += 260;
//                    if (playerHealth > playerHealth1){
//                        playerHealth = playerHealth1;
//                        System.out.println("Player now has full health" + playerHealth1 + "/" + playerHealth);
//                    }
//                }
//                if (monsterHealth <= 0)
//                    gameOver = true;
//
//
//                playerHealth -= monsterDamage;
//                System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");
//                if ( playerHealth <= 0)
//                    gameOver = true;
//
//
//
//            }
//        monsterHealth = 3100;
//        monsterDamage = 600;
//        monsterName = "Zombie";
//
//        gameOver = false;
//
//        while (!gameOver) {
//            System.out.println("Now battling monster " + monsterName + "! ");
//            System.out.println("Enter player action(0 to attack , 1 to heal");
//            int action = scanner.nextInt();
//            if (action == 0){
//                monsterHealth -= playerDamage;
//
//                if (monsterHealth <= 0) {
//                    gameOver = true;
//                    System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
//                }else {
//                    System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
//                            " health remaining!");
//                }
//            }else if (action == 1){
//                playerHealth += 260;
//                if (playerHealth > playerHealth1){
//                    playerHealth = playerHealth1;
//                    System.out.println("Player now has full health" + playerHealth1 + "/" + playerHealth);
//                }
//            }
//            if (monsterHealth <= 0)
//                gameOver = true;
//
//
//            playerHealth -= monsterDamage;
//            System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");
//            if ( playerHealth <= 0)
//                gameOver = true;
//
//
//
//        }
//
//
//
//        monsterHealth = 4400;
//        monsterDamage = 840;
//        monsterName = "King of Monsters";
//
//        gameOver = false;
//
//        while (!gameOver) {
//            System.out.println("Now battling monster " + monsterName + "! ");
//            System.out.println("Enter player action(0 to attack , 1 to heal");
//            int action = scanner.nextInt();
//            if (action == 0){
//                monsterHealth -= playerDamage;
//
//                if (monsterHealth <= 0) {
//                    gameOver = true;
//                    System.out.println("You killed monster " + monsterName + "! You are moving to next round!");
//                }else {
//                    System.out.println("You attacked monster " + monsterName + "! " + monsterName + " has " + monsterHealth +
//                            " health remaining!");
//                }
//            }else if (action == 1){
//                playerHealth += 260;
//                if (playerHealth > playerHealth1){
//                    playerHealth = playerHealth1;
//                    System.out.println("Player now has full health" + playerHealth1 + "/" + playerHealth);
//                }
//            }
//            if (monsterHealth <= 0)
//                gameOver = true;
//
//
//            playerHealth -= monsterDamage;
//            System.out.println("Monster " + monsterName + " attacked you!You have " + playerHealth + " remaining!");
//            if ( playerHealth <= 0)
//                gameOver = true;
//
//
//
//        }
//
//
                                    }
                                }
                            }


                        }
                    }
                }

            }


            }


            int noRisk = gun;

        if (diamondBomb > noRisk && diamondBomb > sword && diamondBomb > bomb){
            System.out.println("You are a very risky person. You think most of killing the monster." +
                    " You have the highest percentage of killing yourself in the game.");

        }else if (bomb > noRisk && bomb > sword && bomb > diamondBomb){

            System.out.println("You are a pretty risky person. You mostly think of killing the monster." +
                    "You have the second highest percentage of killing yourself in the game. ");
        }else if (sword > noRisk && sword > bomb && sword > diamondBomb){
            System.out.println("You are not a very risky person. You mostly think of not killing yourself, while trying to kill the monster." +
                    "You have the second lowest percentage of killing yourself in the game.");


        }else  if (noRisk > diamondBomb && noRisk > sword && noRisk > bomb){
            System.out.println("You are not a risky person att all. You think the most of staying alive and not killing yourself." +
                    "You have the lowest chance of killing yourself in the game.");


        }






        System.out.println("You used gun " + gun + " times.");
        System.out.println("You used diamond sword " + sword + " times.");
        System.out.println("You used bomb " + bomb + " times.");
        System.out.println("You used diamond grenade bomb " + diamondBomb + " times.");


    }
    }
