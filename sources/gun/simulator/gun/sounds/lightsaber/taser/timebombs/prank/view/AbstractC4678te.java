package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4678te implements InterfaceC4753uV {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        FW.q(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4753uV
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
