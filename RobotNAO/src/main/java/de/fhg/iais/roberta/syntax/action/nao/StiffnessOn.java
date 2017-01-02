package de.fhg.iais.roberta.syntax.action.nao;

import de.fhg.iais.roberta.blockly.generated.Block;
import de.fhg.iais.roberta.syntax.BlockTypeContainer;
import de.fhg.iais.roberta.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.syntax.BlocklyComment;
import de.fhg.iais.roberta.syntax.Phrase;
import de.fhg.iais.roberta.syntax.action.Action;
import de.fhg.iais.roberta.transformer.Jaxb2AstTransformer;
import de.fhg.iais.roberta.transformer.JaxbTransformerHelper;
import de.fhg.iais.roberta.visitor.AstVisitor;
import de.fhg.iais.roberta.visitor.NaoAstVisitor;

/**
 * This class represents the <b>naoActions_stiffnessOn</b> block from Blockly into the AST (abstract syntax tree).
 * Object from this class will generate code for turning all motors in the robots body on.<br/>
 * <br/>
 */
public final class StiffnessOn<V> extends Action<V> {

    private StiffnessOn(BlocklyBlockProperties properties, BlocklyComment comment) {
        super(BlockTypeContainer.getByName("STIFFNESS_ON"), properties, comment);
        setReadOnly();
    }

    /**
     * Creates instance of {@link StiffnessOn}. This instance is read only and can not be modified.
     *
     * @param properties of the block (see {@link BlocklyBlockProperties}),
     * @param comment added from the user,
     * @return read only object of class {@link StiffnessOn}
     */
    private static <V> StiffnessOn<V> make(BlocklyBlockProperties properties, BlocklyComment comment) {
        return new StiffnessOn<V>(properties, comment);
    }

    @Override
    public String toString() {
        return "StiffnessOn []";
    }

    @Override
    protected V accept(AstVisitor<V> visitor) {
        return ((NaoAstVisitor<V>) visitor).visitStiffnessOn(this);
    }

    /**
     * Transformation from JAXB object to corresponding AST object.
     *
     * @param block for transformation
     * @param helper class for making the transformation
     * @return corresponding AST object
     */
    public static <V> Phrase<V> jaxbToAst(Block block, Jaxb2AstTransformer<V> helper) {

        return StiffnessOn.make(helper.extractBlockProperties(block), helper.extractComment(block));
    }

    @Override
    public Block astToBlock() {
        Block jaxbDestination = new Block();
        JaxbTransformerHelper.setBasicProperties(this, jaxbDestination);

        return jaxbDestination;
    }
}