/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRDoor
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_doorProcess_voidTovoid;
	public Cap_ext_ JRget_op_doorProcess_voidTovoid() {
		return op_doorProcess_voidTovoid;
	}
	public void JRset_op_doorProcess_voidTovoid(Cap_ext_ op_doorProcess_voidTovoid) {
		this.op_doorProcess_voidTovoid = op_doorProcess_voidTovoid;
	}

	public Cap_ext_ op_leave_PersonTovoid;
	public Cap_ext_ JRget_op_leave_PersonTovoid() {
		return op_leave_PersonTovoid;
	}
	public void JRset_op_leave_PersonTovoid(Cap_ext_ op_leave_PersonTovoid) {
		this.op_leave_PersonTovoid = op_leave_PersonTovoid;
	}

	public Cap_ext_ op_lock_Cap_voidTovoidTojavadotutildotList;
	public Cap_ext_ JRget_op_lock_Cap_voidTovoidTojavadotutildotList() {
		return op_lock_Cap_voidTovoidTojavadotutildotList;
	}
	public void JRset_op_lock_Cap_voidTovoidTojavadotutildotList(Cap_ext_ op_lock_Cap_voidTovoidTojavadotutildotList) {
		this.op_lock_Cap_voidTovoidTojavadotutildotList = op_lock_Cap_voidTovoidTojavadotutildotList;
	}

	public Cap_ext_ op_isClosed_voidToboolean;
	public Cap_ext_ JRget_op_isClosed_voidToboolean() {
		return op_isClosed_voidToboolean;
	}
	public void JRset_op_isClosed_voidToboolean(Cap_ext_ op_isClosed_voidToboolean) {
		this.op_isClosed_voidToboolean = op_isClosed_voidToboolean;
	}

	public Cap_ext_ op_add_PersonToint;
	public Cap_ext_ JRget_op_add_PersonToint() {
		return op_add_PersonToint;
	}
	public void JRset_op_add_PersonToint(Cap_ext_ op_add_PersonToint) {
		this.op_add_PersonToint = op_add_PersonToint;
	}

	public JRDoor(JRDoor copy)
	{
	this.op_doorProcess_voidTovoid = copy.op_doorProcess_voidTovoid;
	this.op_leave_PersonTovoid = copy.op_leave_PersonTovoid;
	this.op_lock_Cap_voidTovoidTojavadotutildotList = copy.op_lock_Cap_voidTovoidTojavadotutildotList;
	this.op_isClosed_voidToboolean = copy.op_isClosed_voidToboolean;
	this.op_add_PersonToint = copy.op_add_PersonToint;

	}
	public JRDoor(Object ... opSig)
	{
	this.op_doorProcess_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_leave_PersonTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_lock_Cap_voidTovoidTojavadotutildotList = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_isClosed_voidToboolean = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_add_PersonToint = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRDoor(boolean dummy)	{
	    super(dummy);
	this.op_doorProcess_voidTovoid = Cap_ext_.noop;
	this.op_leave_PersonTovoid = Cap_ext_.noop;
	this.op_lock_Cap_voidTovoidTojavadotutildotList = Cap_ext_.noop;
	this.op_isClosed_voidToboolean = Cap_ext_.noop;
	this.op_add_PersonToint = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRDoor(true);
	}
    }
