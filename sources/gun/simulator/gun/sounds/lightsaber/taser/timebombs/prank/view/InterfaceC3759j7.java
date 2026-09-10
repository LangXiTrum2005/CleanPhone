package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3759j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4537a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    C3585h7 a(C3585h7 c3585h7);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
