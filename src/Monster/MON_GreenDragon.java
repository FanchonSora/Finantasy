package Monster;

import java.awt.Graphics2D;

import Entities.Entity;
import Main.GamePanel;

public class MON_GreenDragon extends Entity implements MonsterInt<Graphics2D, GamePanel>{

    GamePanel gamePanel;

    public MON_GreenDragon(GamePanel gamePanel) {
        super(gamePanel);
        this.gamePanel = gamePanel;

        type = type_monster;
        name = "Earth Dragon";
        direction = "down";
        maxLife = 30;
        life = maxLife;
        attack = 15;
        defense = 20;
        exp = 20;
        coin = 20;
        mana = 0;
        maxMana = 2;
        state = normalState;

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        Defeat = false;
        getImage();
    }
    public void getImage(){
        
        up1 = setupMonsterImages("Monster/BossMonster/Dragon_1",100,100);
        down1 = setupMonsterImages("Monster/BossMonster/Dragon_1",100,100);
        left1 = setupMonsterImages("Monster/BossMonster/Dragon_1",100,100);
        right1 = setupMonsterImages("Monster/BossMonster/Dragon_1",100,100);
    }   
    @Override
    public void setAction(){}
    @Override
    public void damage(Entity entity){
        
            entity.state = entity.getDamageState;
            int damage = attack - entity.defense;
            if(damage <= 0){
                damage = 0;
            }
            else{
                entity.life -= damage;
                gamePanel.ui.addMessage(damage + " damage!");
            }
    }
    
    @Override
    public void draw(Graphics2D g2,GamePanel gamePanel) {

    }
}
