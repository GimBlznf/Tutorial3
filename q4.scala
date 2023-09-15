object q4 extends App{

  def TotalPrice(x: Int):Double={
    var TotalCoverPrice:Double=24.95*x;
    var discount:Double=TotalCoverPrice*0.4;
    var shipping:Double=if(x<50){x*3.0}else{50.0*3.0+(x-50)*0.75};
    return TotalCoverPrice-discount+shipping;
  }

    println("Final Price : "+TotalPrice(60));

}
