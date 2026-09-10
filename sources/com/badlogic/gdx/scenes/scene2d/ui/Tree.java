package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Tree.Node;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.badlogic.gdx.scenes.scene2d.utils.Selection;
import com.badlogic.gdx.scenes.scene2d.utils.UIUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public class Tree<N extends Node, V> extends WidgetGroup {
    private static final Vector2 tmp = new Vector2();
    private ClickListener clickListener;
    private N foundNode;
    float iconSpacingLeft;
    float iconSpacingRight;
    float indentSpacing;
    private N overNode;
    float paddingLeft;
    float paddingRight;
    private float prefHeight;
    private float prefWidth;
    N rangeStart;
    final Array<N> rootNodes;
    final Selection<N> selection;
    private boolean sizeInvalid;
    TreeStyle style;
    float ySpacing;

    public static class TreeStyle {

        @Null
        public Drawable background;
        public Drawable minus;

        @Null
        public Drawable minusOver;

        @Null
        public Drawable over;
        public Drawable plus;

        @Null
        public Drawable plusOver;

        @Null
        public Drawable selection;

        public TreeStyle() {
        }

        public TreeStyle(Drawable drawable, Drawable drawable2, @Null Drawable drawable3) {
            this.plus = drawable;
            this.minus = drawable2;
            this.selection = drawable3;
        }

        public TreeStyle(TreeStyle treeStyle) {
            this.plus = treeStyle.plus;
            this.minus = treeStyle.minus;
            this.plusOver = treeStyle.plusOver;
            this.minusOver = treeStyle.minusOver;
            this.over = treeStyle.over;
            this.selection = treeStyle.selection;
            this.background = treeStyle.background;
        }
    }

    public Tree(Skin skin) {
        this((TreeStyle) skin.get(TreeStyle.class));
    }

    private void computeSize() {
        this.sizeInvalid = false;
        float fPlusMinusWidth = plusMinusWidth();
        this.prefWidth = fPlusMinusWidth;
        this.prefHeight = 0.0f;
        computeSize(this.rootNodes, 0.0f, fPlusMinusWidth);
        this.prefWidth = this.paddingLeft + this.paddingRight + this.prefWidth;
    }

    private void initialize() {
        ClickListener clickListener = new ClickListener() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Tree.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener
            public void clicked(InputEvent inputEvent, float f, float f2) {
                N n = (N) Tree.this.getNodeAt(f2);
                if (n != null && n == Tree.this.getNodeAt(getTouchDownY())) {
                    if (Tree.this.selection.getMultiple() && Tree.this.selection.notEmpty() && UIUtils.shift()) {
                        Tree tree = Tree.this;
                        if (tree.rangeStart == null) {
                            tree.rangeStart = n;
                        }
                        N n2 = tree.rangeStart;
                        if (!UIUtils.ctrl()) {
                            Tree.this.selection.clear();
                        }
                        float y = n2.actor.getY();
                        float y2 = n.actor.getY();
                        if (y > y2) {
                            Tree tree2 = Tree.this;
                            tree2.selectNodes(tree2.rootNodes, y2, y);
                        } else {
                            Tree tree3 = Tree.this;
                            tree3.selectNodes(tree3.rootNodes, y, y2);
                            Tree.this.selection.items().orderedItems().reverse();
                        }
                        Tree.this.selection.fireChangeEvent();
                        Tree.this.rangeStart = n2;
                        return;
                    }
                    if (n.children.size > 0 && (!Tree.this.selection.getMultiple() || !UIUtils.ctrl())) {
                        float x = n.actor.getX();
                        Drawable drawable = n.icon;
                        if (drawable != null) {
                            x -= drawable.getMinWidth() + Tree.this.iconSpacingRight;
                        }
                        if (f < x) {
                            n.setExpanded(!n.expanded);
                            return;
                        }
                    }
                    if (n.isSelectable()) {
                        Tree.this.selection.choose(n);
                        if (Tree.this.selection.isEmpty()) {
                            return;
                        }
                        Tree.this.rangeStart = n;
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
            public void enter(InputEvent inputEvent, float f, float f2, int i, Actor actor) {
                super.enter(inputEvent, f, f2, i, actor);
                Tree tree = Tree.this;
                tree.setOverNode(tree.getNodeAt(f2));
            }

            @Override // com.badlogic.gdx.scenes.scene2d.utils.ClickListener, com.badlogic.gdx.scenes.scene2d.InputListener
            public void exit(InputEvent inputEvent, float f, float f2, int i, @Null Actor actor) {
                super.exit(inputEvent, f, f2, i, actor);
                if (actor == null || !actor.isDescendantOf(Tree.this)) {
                    Tree.this.setOverNode(null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.badlogic.gdx.scenes.scene2d.InputListener
            public boolean mouseMoved(InputEvent inputEvent, float f, float f2) {
                Tree tree = Tree.this;
                tree.setOverNode(tree.getNodeAt(f2));
                return false;
            }
        };
        this.clickListener = clickListener;
        addListener(clickListener);
    }

    private float plusMinusWidth() {
        float fMax = Math.max(this.style.plus.getMinWidth(), this.style.minus.getMinWidth());
        Drawable drawable = this.style.plusOver;
        if (drawable != null) {
            fMax = Math.max(fMax, drawable.getMinWidth());
        }
        Drawable drawable2 = this.style.minusOver;
        return drawable2 != null ? Math.max(fMax, drawable2.getMinWidth()) : fMax;
    }

    public void add(N n) {
        insert(this.rootNodes.size, n);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group
    public void clearChildren(boolean z) {
        super.clearChildren(z);
        setOverNode(null);
        this.rootNodes.clear();
        this.selection.clear();
    }

    public void collapseAll() {
        collapseAll(this.rootNodes);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(Batch batch, float f) {
        drawBackground(batch, f);
        Color color = getColor();
        float f2 = color.f202a * f;
        batch.setColor(color.r, color.g, color.b, f2);
        drawIcons(batch, color.r, color.g, color.b, f2, null, this.rootNodes, this.paddingLeft, plusMinusWidth());
        super.draw(batch, f);
    }

    public void drawBackground(Batch batch, float f) {
        if (this.style.background != null) {
            Color color = getColor();
            batch.setColor(color.r, color.g, color.b, color.f202a * f);
            this.style.background.draw(batch, getX(), getY(), getWidth(), getHeight());
        }
    }

    public void drawExpandIcon(N n, Drawable drawable, Batch batch, float f, float f2) {
        drawable.draw(batch, f, f2, drawable.getMinWidth(), drawable.getMinHeight());
    }

    public void drawIcon(N n, Drawable drawable, Batch batch, float f, float f2) {
        drawable.draw(batch, f, f2, drawable.getMinWidth(), drawable.getMinHeight());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    public float drawIcons(Batch batch, float f, float f2, float f3, float f4, @Null N n, Array<N> array, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        Actor actor;
        int i;
        int i2;
        N n2;
        Drawable drawable;
        Drawable drawable2;
        Rectangle cullingArea = getCullingArea();
        float f10 = 0.0f;
        if (cullingArea != null) {
            float f11 = cullingArea.y;
            f7 = f11;
            f8 = cullingArea.height + f11;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        TreeStyle treeStyle = this.style;
        float x = getX();
        float y = getY();
        float f12 = x + f5;
        float f13 = f12 + f6 + this.iconSpacingLeft;
        int i3 = 0;
        for (int i4 = array.size; i3 < i4; i4 = i2) {
            N n3 = array.get(i3);
            Actor actor2 = n3.actor;
            float y2 = actor2.getY();
            float f14 = n3.height;
            if (cullingArea == null || (y2 + f14 >= f7 && y2 <= f8)) {
                if (!this.selection.contains(n3) || (drawable2 = treeStyle.selection) == null) {
                    f9 = f14;
                    actor = actor2;
                    i = i3;
                    i2 = i4;
                    n2 = n3;
                    if (n2 == this.overNode && (drawable = treeStyle.over) != null) {
                        drawOver(n2, drawable, batch, x, (y + y2) - (this.ySpacing / 2.0f), getWidth(), f9 + this.ySpacing);
                    }
                } else {
                    f9 = f14;
                    actor = actor2;
                    i2 = i4;
                    n2 = n3;
                    i = i3;
                    drawSelection(n3, drawable2, batch, x, (y + y2) - (this.ySpacing / 2.0f), getWidth(), f14 + this.ySpacing);
                }
                Drawable drawable3 = n2.icon;
                if (drawable3 != null) {
                    float fRound = y + y2 + Math.round((f9 - drawable3.getMinHeight()) / 2.0f);
                    Color color = actor.getColor();
                    batch.setColor(color.r, color.g, color.b, color.f202a * f4);
                    drawIcon(n2, n2.icon, batch, f13, fRound);
                    batch.setColor(f, f2, f3, f4);
                }
                if (n2.children.size > 0) {
                    Drawable expandIcon = getExpandIcon(n2, f13);
                    drawExpandIcon(n2, expandIcon, batch, f12, y + y2 + Math.round((f9 - expandIcon.getMinHeight()) / 2.0f));
                }
            } else {
                if (y2 < f7) {
                    return y2;
                }
                i = i3;
                i2 = i4;
                n2 = n3;
            }
            if (n2.expanded) {
                Array<N> array2 = n2.children;
                if (array2.size > 0) {
                    drawIcons(batch, f, f2, f3, f4, n2, array2, f5 + this.indentSpacing, f6);
                }
            }
            i3 = i + 1;
            f10 = y2;
            f13 = f13;
        }
        return f10;
    }

    public void drawOver(N n, Drawable drawable, Batch batch, float f, float f2, float f3, float f4) {
        drawable.draw(batch, f, f2, f3, f4);
    }

    public void drawSelection(N n, Drawable drawable, Batch batch, float f, float f2, float f3, float f4) {
        drawable.draw(batch, f, f2, f3, f4);
    }

    public void expandAll() {
        expandAll(this.rootNodes);
    }

    public void findExpandedValues(Array<V> array) {
        findExpandedValues(this.rootNodes, array);
    }

    @Null
    public N findNode(V v) {
        if (v != null) {
            return (N) findNode(this.rootNodes, v);
        }
        throw new IllegalArgumentException("value cannot be null.");
    }

    public ClickListener getClickListener() {
        return this.clickListener;
    }

    public Drawable getExpandIcon(N n, float f) {
        if (n == this.overNode && Gdx.app.getType() == Application.ApplicationType.Desktop && (!this.selection.getMultiple() || (!UIUtils.ctrl() && !UIUtils.shift()))) {
            float x = getX() + screenToLocalCoordinates(tmp.set(Gdx.input.getX(), 0.0f)).x;
            if (x >= 0.0f && x < f) {
                Drawable drawable = n.expanded ? this.style.minusOver : this.style.plusOver;
                if (drawable != null) {
                    return drawable;
                }
            }
        }
        return n.expanded ? this.style.minus : this.style.plus;
    }

    public float getIndentSpacing() {
        return this.indentSpacing;
    }

    @Null
    public N getNodeAt(float f) {
        this.foundNode = null;
        getNodeAt(this.rootNodes, f, getHeight());
        try {
            return this.foundNode;
        } finally {
            this.foundNode = null;
        }
    }

    @Deprecated
    public Array<N> getNodes() {
        return this.rootNodes;
    }

    @Null
    public N getOverNode() {
        return this.overNode;
    }

    @Null
    public V getOverValue() {
        N n = this.overNode;
        if (n == null) {
            return null;
        }
        return (V) n.getValue();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefHeight() {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefHeight;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public float getPrefWidth() {
        if (this.sizeInvalid) {
            computeSize();
        }
        return this.prefWidth;
    }

    public Array<N> getRootNodes() {
        return this.rootNodes;
    }

    @Null
    public N getSelectedNode() {
        return this.selection.first();
    }

    @Null
    public V getSelectedValue() {
        N nFirst = this.selection.first();
        if (nFirst == null) {
            return null;
        }
        return (V) nFirst.getValue();
    }

    public Selection<N> getSelection() {
        return this.selection;
    }

    public TreeStyle getStyle() {
        return this.style;
    }

    public float getYSpacing() {
        return this.ySpacing;
    }

    public void insert(int i, N n) {
        int iCountActors;
        N n2 = n.parent;
        if (n2 != null) {
            n2.remove(n);
            n.parent = null;
        } else {
            int iIndexOf = this.rootNodes.indexOf(n, true);
            if (iIndexOf != -1) {
                if (iIndexOf == i) {
                    return;
                }
                if (iIndexOf < i) {
                    i--;
                }
                this.rootNodes.removeIndex(iIndexOf);
                int zIndex = n.actor.getZIndex();
                if (zIndex != -1) {
                    n.removeFromTree(this, zIndex);
                }
            }
        }
        this.rootNodes.insert(i, n);
        if (i == 0) {
            iCountActors = 0;
        } else {
            Array<N> array = this.rootNodes;
            if (i < array.size - 1) {
                iCountActors = array.get(i + 1).actor.getZIndex();
            } else {
                N n3 = array.get(i - 1);
                iCountActors = n3.countActors() + n3.actor.getZIndex();
            }
        }
        n.addToTree(this, iCountActors);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void invalidate() {
        super.invalidate();
        this.sizeInvalid = true;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup, com.badlogic.gdx.scenes.scene2d.utils.Layout
    public void layout() {
        if (this.sizeInvalid) {
            computeSize();
        }
        layout(this.rootNodes, this.paddingLeft, getHeight() - (this.ySpacing / 2.0f), plusMinusWidth());
    }

    public void remove(N n) {
        int zIndex;
        N n2 = n.parent;
        if (n2 != null) {
            n2.remove(n);
        } else if (this.rootNodes.removeValue(n, true) && (zIndex = n.actor.getZIndex()) != -1) {
            n.removeFromTree(this, zIndex);
        }
    }

    public void restoreExpandedValues(Array<V> array) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Node nodeFindNode = findNode(array.get(i2));
            if (nodeFindNode != null) {
                nodeFindNode.setExpanded(true);
                nodeFindNode.expandTo();
            }
        }
    }

    public void selectNodes(Array<N> array, float f, float f2) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            N n = array.get(i2);
            if (n.actor.getY() < f) {
                return;
            }
            if (n.isSelectable()) {
                if (n.actor.getY() <= f2) {
                    this.selection.add(n);
                }
                if (n.expanded) {
                    selectNodes(n.children, f, f2);
                }
            }
        }
    }

    public void setIconSpacing(float f, float f2) {
        this.iconSpacingLeft = f;
        this.iconSpacingRight = f2;
    }

    public void setIndentSpacing(float f) {
        this.indentSpacing = f;
    }

    public void setOverNode(@Null N n) {
        this.overNode = n;
    }

    public void setPadding(float f) {
        this.paddingLeft = f;
        this.paddingRight = f;
    }

    public void setStyle(TreeStyle treeStyle) {
        this.style = treeStyle;
        if (this.indentSpacing == 0.0f) {
            this.indentSpacing = plusMinusWidth();
        }
    }

    public void setYSpacing(float f) {
        this.ySpacing = f;
    }

    public void updateRootNodes() {
        int i = this.rootNodes.size;
        for (int i2 = 0; i2 < i; i2++) {
            N n = this.rootNodes.get(i2);
            int zIndex = n.actor.getZIndex();
            if (zIndex != -1) {
                n.removeFromTree(this, zIndex);
            }
        }
        int i3 = this.rootNodes.size;
        int iAddToTree = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iAddToTree += this.rootNodes.get(i4).addToTree(this, iAddToTree);
        }
    }

    public Tree(Skin skin, String str) {
        this((TreeStyle) skin.get(str, TreeStyle.class));
    }

    public static void collapseAll(Array<? extends Node> array) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Node node = array.get(i2);
            node.setExpanded(false);
            collapseAll(node.children);
        }
    }

    public static void expandAll(Array<? extends Node> array) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            array.get(i2).expandAll();
        }
    }

    public static boolean findExpandedValues(Array<? extends Node> array, Array array2) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Node node = array.get(i2);
            if (node.expanded && !findExpandedValues(node.children, array2)) {
                array2.add(node.value);
            }
        }
        return false;
    }

    public Tree(TreeStyle treeStyle) {
        this.rootNodes = new Array<>();
        this.ySpacing = 4.0f;
        this.iconSpacingLeft = 2.0f;
        this.iconSpacingRight = 2.0f;
        this.sizeInvalid = true;
        Selection<N> selection = (Selection<N>) new Selection<N>() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Tree.1
            @Override // com.badlogic.gdx.scenes.scene2d.utils.Selection
            public void changed() {
                int size = size();
                if (size == 0) {
                    Tree.this.rangeStart = null;
                } else {
                    if (size != 1) {
                        return;
                    }
                    Tree.this.rangeStart = (N) first();
                }
            }
        };
        this.selection = selection;
        selection.setActor(this);
        selection.setMultiple(true);
        setStyle(treeStyle);
        initialize();
    }

    @Null
    public static Node findNode(Array<? extends Node> array, Object obj) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            Node node = array.get(i2);
            if (obj.equals(node.value)) {
                return node;
            }
        }
        int i3 = array.size;
        for (int i4 = 0; i4 < i3; i4++) {
            Node nodeFindNode = findNode(array.get(i4).children, obj);
            if (nodeFindNode != null) {
                return nodeFindNode;
            }
        }
        return null;
    }

    private float layout(Array<N> array, float f, float f2, float f3) {
        float f4 = this.ySpacing;
        float f5 = this.iconSpacingLeft;
        float f6 = this.iconSpacingRight + f5;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            N n = array.get(i2);
            float f7 = f + f3;
            Drawable drawable = n.icon;
            float minWidth = drawable != null ? drawable.getMinWidth() + f6 + f7 : f7 + f5;
            A a2 = n.actor;
            if (a2 instanceof Layout) {
                ((Layout) a2).pack();
            }
            float height = f2 - n.getHeight();
            n.actor.setPosition(minWidth, height);
            f2 = height - f4;
            if (n.expanded) {
                f2 = layout(n.children, this.indentSpacing + f, f2, f3);
            }
        }
        return f2;
    }

    public void setPadding(float f, float f2) {
        this.paddingLeft = f;
        this.paddingRight = f2;
    }

    public static abstract class Node<N extends Node, V, A extends Actor> {
        A actor;
        boolean expanded;
        float height;
        Drawable icon;
        N parent;
        V value;
        final Array<N> children = new Array<>(0);
        boolean selectable = true;

        public Node(A a2) {
            if (a2 == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            this.actor = a2;
        }

        public void add(N n) {
            insert(this.children.size, n);
        }

        public void addAll(Array<N> array) {
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                insert(this.children.size, array.get(i2));
            }
        }

        public int addToTree(Tree<N, V> tree, int i) {
            tree.addActorAt(i, this.actor);
            if (!this.expanded) {
                return 1;
            }
            int iAddToTree = i + 1;
            Array<N> array = this.children;
            N[] nArr = array.items;
            int i2 = array.size;
            for (int i3 = 0; i3 < i2; i3++) {
                iAddToTree += nArr[i3].addToTree(tree, iAddToTree);
            }
            return iAddToTree - i;
        }

        public void clearChildren() {
            Tree<N, V> tree;
            if (this.expanded && (tree = getTree()) != null) {
                int zIndex = this.actor.getZIndex() + 1;
                Array<N> array = this.children;
                N[] nArr = array.items;
                int i = array.size;
                for (int i2 = 0; i2 < i; i2++) {
                    nArr[i2].removeFromTree(tree, zIndex);
                }
            }
            this.children.clear();
        }

        public void collapseAll() {
            setExpanded(false);
            Tree.collapseAll(this.children);
        }

        public int countActors() {
            int iCountActors = 1;
            if (!this.expanded) {
                return 1;
            }
            Array<N> array = this.children;
            N[] nArr = array.items;
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                iCountActors += nArr[i2].countActors();
            }
            return iCountActors;
        }

        public void expandAll() {
            setExpanded(true);
            Array<N> array = this.children;
            if (array.size > 0) {
                Tree.expandAll(array);
            }
        }

        public void expandTo() {
            for (N n = this.parent; n != null; n = n.parent) {
                n.setExpanded(true);
            }
        }

        public void findExpandedValues(Array<V> array) {
            if (!this.expanded || Tree.findExpandedValues(this.children, array)) {
                return;
            }
            array.add(this.value);
        }

        @Null
        public N findNode(V v) {
            if (v != null) {
                return v.equals(this.value) ? this : (N) Tree.findNode(this.children, v);
            }
            throw new IllegalArgumentException("value cannot be null.");
        }

        public A getActor() {
            return this.actor;
        }

        public Array<N> getChildren() {
            return this.children;
        }

        public float getHeight() {
            return this.height;
        }

        @Null
        public Drawable getIcon() {
            return this.icon;
        }

        public int getLevel() {
            int i = 0;
            Node<N, V, A> parent = this;
            do {
                i++;
                parent = parent.getParent();
            } while (parent != null);
            return i;
        }

        @Null
        public N getParent() {
            return this.parent;
        }

        @Null
        public Tree<N, V> getTree() {
            Group parent = this.actor.getParent();
            if (parent instanceof Tree) {
                return (Tree) parent;
            }
            return null;
        }

        @Null
        public V getValue() {
            return this.value;
        }

        public boolean hasChildren() {
            return this.children.size > 0;
        }

        public void insert(int i, N n) {
            Tree<N, V> tree;
            int iCountActors;
            n.parent = this;
            this.children.insert(i, n);
            if (this.expanded && (tree = getTree()) != null) {
                if (i == 0) {
                    iCountActors = this.actor.getZIndex() + 1;
                } else {
                    Array<N> array = this.children;
                    if (i < array.size - 1) {
                        iCountActors = array.get(i + 1).actor.getZIndex();
                    } else {
                        N n2 = array.get(i - 1);
                        iCountActors = n2.countActors() + n2.actor.getZIndex();
                    }
                }
                n.addToTree(tree, iCountActors);
            }
        }

        public boolean isAscendantOf(N n) {
            if (n == null) {
                throw new IllegalArgumentException("node cannot be null.");
            }
            while (n != this) {
                n = n.parent;
                if (n == null) {
                    return false;
                }
            }
            return true;
        }

        public boolean isDescendantOf(N n) {
            if (n == null) {
                throw new IllegalArgumentException("node cannot be null.");
            }
            N n2 = this;
            while (n2 != n) {
                n2 = n2.parent;
                if (n2 == null) {
                    return false;
                }
            }
            return true;
        }

        public boolean isExpanded() {
            return this.expanded;
        }

        public boolean isSelectable() {
            return this.selectable;
        }

        public void remove() {
            Tree<N, V> tree = getTree();
            if (tree != null) {
                tree.remove(this);
                return;
            }
            N n = this.parent;
            if (n != null) {
                n.remove(this);
            }
        }

        public void removeFromTree(Tree<N, V> tree, int i) {
            tree.removeActorAt(i, true);
            if (this.expanded) {
                Array<N> array = this.children;
                N[] nArr = array.items;
                int i2 = array.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    nArr[i3].removeFromTree(tree, i);
                }
            }
        }

        public void restoreExpandedValues(Array<V> array) {
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                Node nodeFindNode = findNode(array.get(i2));
                if (nodeFindNode != null) {
                    nodeFindNode.setExpanded(true);
                    nodeFindNode.expandTo();
                }
            }
        }

        public void setActor(A a2) {
            Tree<N, V> tree;
            if (this.actor != null && (tree = getTree()) != null) {
                int zIndex = this.actor.getZIndex();
                tree.removeActorAt(zIndex, true);
                tree.addActorAt(zIndex, a2);
            }
            this.actor = a2;
        }

        public void setExpanded(boolean z) {
            Tree<N, V> tree;
            if (z == this.expanded) {
                return;
            }
            this.expanded = z;
            if (this.children.size == 0 || (tree = getTree()) == null) {
                return;
            }
            N[] nArr = this.children.items;
            int zIndex = this.actor.getZIndex() + 1;
            int i = 0;
            if (z) {
                int i2 = this.children.size;
                while (i < i2) {
                    zIndex += nArr[i].addToTree(tree, zIndex);
                    i++;
                }
                return;
            }
            int i3 = this.children.size;
            while (i < i3) {
                nArr[i].removeFromTree(tree, zIndex);
                i++;
            }
        }

        public void setIcon(@Null Drawable drawable) {
            this.icon = drawable;
        }

        public void setSelectable(boolean z) {
            this.selectable = z;
        }

        public void setValue(@Null V v) {
            this.value = v;
        }

        public void updateChildren() {
            Tree<N, V> tree;
            if (this.expanded && (tree = getTree()) != null) {
                Array<N> array = this.children;
                N[] nArr = array.items;
                int i = array.size;
                int zIndex = this.actor.getZIndex() + 1;
                for (int i2 = 0; i2 < i; i2++) {
                    nArr[i2].removeFromTree(tree, zIndex);
                }
                for (int i3 = 0; i3 < i; i3++) {
                    zIndex += nArr[i3].addToTree(tree, zIndex);
                }
            }
        }

        public void remove(N n) {
            Tree<N, V> tree;
            if (this.children.removeValue(n, true) && this.expanded && (tree = getTree()) != null) {
                n.removeFromTree(tree, n.actor.getZIndex());
            }
        }

        public Node() {
        }
    }

    private void computeSize(Array<N> array, float f, float f2) {
        float width;
        float f3 = this.ySpacing;
        float f4 = this.iconSpacingLeft + this.iconSpacingRight;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            N n = array.get(i2);
            float f5 = f + f2;
            A a2 = n.actor;
            if (a2 instanceof Layout) {
                Layout layout = (Layout) a2;
                width = layout.getPrefWidth() + f5;
                n.height = layout.getPrefHeight();
            } else {
                width = a2.getWidth() + f5;
                n.height = a2.getHeight();
            }
            Drawable drawable = n.icon;
            if (drawable != null) {
                width += drawable.getMinWidth() + f4;
                n.height = Math.max(n.height, n.icon.getMinHeight());
            }
            this.prefWidth = Math.max(this.prefWidth, width);
            this.prefHeight = n.height + f3 + this.prefHeight;
            if (n.expanded) {
                computeSize(n.children, this.indentSpacing + f, f2);
            }
        }
    }

    private float getNodeAt(Array<N> array, float f, float f2) {
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            N n = array.get(i2);
            float f3 = n.height;
            float height = f2 - (n.getHeight() - f3);
            float f4 = this.ySpacing;
            if (f >= (height - f3) - f4 && f < height) {
                this.foundNode = n;
                return -1.0f;
            }
            f2 = height - (f3 + f4);
            if (n.expanded) {
                f2 = getNodeAt(n.children, f, f2);
                if (f2 == -1.0f) {
                    return -1.0f;
                }
            }
        }
        return f2;
    }
}
