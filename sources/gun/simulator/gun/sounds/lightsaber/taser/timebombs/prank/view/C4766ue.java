package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4766ue extends AbstractC4678te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f5090a;

    public C4766ue(char c) {
        this.f5090a = c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4678te
    public final boolean b(char c) {
        return c == this.f5090a;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c = this.f5090a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
