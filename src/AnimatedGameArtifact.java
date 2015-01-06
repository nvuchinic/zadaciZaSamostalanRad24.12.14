/**
 * interface that extends GameArtifact inteface and contains signature for two methods 
 * */
public interface AnimatedGameArtifact extends GameArtifact {
void animateFrame(long frameNumber);
void setSpeed(double speed);
}
