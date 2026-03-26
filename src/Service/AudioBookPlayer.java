package Service;

import Interfaces.PlayableContent;

public class AudioBookPlayer {
        private PlayableContent currentContent;//Song or AudioBook
        public void setContent(PlayableContent content){
                this.currentContent = currentContent;
        }

        public void play(){
                if(currentContent != null){
                        currentContent.play(1.0f);
                }

        }
        public void pause(){
                if(currentContent != null){
                        currentContent.pause();
                }
        }
        public void resume(){
                if(currentContent != null)
                {
                        currentContent.resume();
                }
        }
        public void stop(){
                if(currentContent != null)
                {
                        currentContent.stop();
                }

        }
}
