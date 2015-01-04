public interface AnimatedGameArtifact extends GameArtifact {
void animateFrame(long frameNumber);
void setSpeed(double speed);
}