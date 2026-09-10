package com.efs.sdk.base.protocol.file.section;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class TextSection extends AbsSection {
    private String body;

    public TextSection(String str) {
        super(MimeTypes.BASE_TYPE_TEXT);
        this.name = str;
    }

    @Override // com.efs.sdk.base.protocol.file.section.AbsSection
    public String changeToStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDeclarationLine());
        sb.append("\n");
        return DM.m(sb, this.body, "\n");
    }

    public void setBody(String str) {
        this.body = str;
    }
}
