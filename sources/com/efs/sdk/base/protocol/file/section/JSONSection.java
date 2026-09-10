package com.efs.sdk.base.protocol.file.section;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class JSONSection extends AbsSection {
    private String body;

    public JSONSection(String str) {
        super("json");
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
