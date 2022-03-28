package com.xworkz.productMusicInsDTO;

public class ProductTester {
	public static void main(String[] args) {
		
		ProductDTO product=new ProductDTO();
		ProductDTO product1=new ProductDTO();
		ProductDTO product2=new ProductDTO();
		ProductDTO product3=new ProductDTO();
		
		product.setSinger("ShreyaGhoshal");//1
		System.out.println(product.getSinger());
		
		product.setArt(true);//2
		System.out.println(product.isArt());
		
		product.setBlack("HighPitch");//3
		System.out.println(product.getBlack());
		
		product.setHabbit(true);//4
		System.out.println(product.isHabbit());
		
		product.setOvertone("unique");//5
		System.out.println(product.getOvertone());
		
		product.setPitch("C");//6
		System.out.println(product.getPitch());
		
		product.setAmplitude("softSound");//7
		System.out.println(product.getAmplitude());
		
		product.setDuration("long");//8
		System.out.println(product.getDuration());
		
		product.setMonophony("soloVoice");//9
		System.out.println(product.getMonophony());
		
		product.setHomophony("band");//10
		System.out.println(product.getHomophony());
		
		product.setPolyphony("independentVoices");//11
		System.out.println(product.getPolyphony());
		
		product.setTempo("fast");//12
		System.out.println(product.getTempo());
		
		product.setArticulation("stressed or smooth");//13
		System.out.println(product.getArticulation());
		
		product.setBeat("steady");//14
		System.out.println(product.getBeat());
		
		product.setEmotionalResponse("happy");//15
		System.out.println(product.getEmotionalResponse());
		
		product.setTimbre("Rough");//16
		System.out.println(product.getTimbre());
		
		product.setMajorScale("CMajor");//17
		System.out.println(product.getMajorScale());
		
		product.setMinorScale("AMinor");//18
		System.out.println(product.getMinorScale());
		
		product.setMajorPentatonic("C");//19
		System.out.println(product.getMajorPentatonic());
		
		product.setMinorPentatonic("A");//20
		System.out.println(product.getMinorPentatonic());
		
		product1.setDupleMeters("twoBeats");//21
		System.out.println(product1.getDupleMeters());
		
		product1.setTripleMeter(3.5);//22
		System.out.println(product1.getTripleMeter());
		
		product1.setCompoundMeter(6.8);//23
		System.out.println(product1.getCompoundMeter());
		
		product1.setPiano("soft");//24
		System.out.println(product1.getPiano());
		
		product2.setMezzoPiano("moderately soft");//25
		System.out.println(product1.getMezzoPiano());
		
		product2.setMezzoForte("moderately loud");//26
		System.out.println(product1.getMezzoForte());
		
		product2.setCrescendo("gradually increasing volume");//27
		System.out.println(product1.getCrescendo());
		
		product2.setDecrescendo("gradually decreasing volume");//28
		System.out.println(product1.getDecrescendo());
		
		product2.setLarghissimo("19 beats per minute or less");//29
		System.out.println(product1.getLarghissimo());
		
		product1.setGrave("20-40 bpm");//30
		System.out.println(product1.getGrave());
		
		product1.setLento("40-45 bpm");//31
		System.out.println(product1.getLento());
		
		product1.setLargo("45-50 bpm");//32
		System.out.println(product1.getLargo());
		
		product1.setLarghetto("50-55 bpm");//33
		System.out.println(product1.getLarghetto());
		
		product1.setAdagio("55-65 bpm");//34
		System.out.println(product1.getAdagio());
		
		product1.setAndante("78-83 bpm");//35
		System.out.println(product1.getAndante());
		
		product1.setPresto("168-177 bpm");//36
		System.out.println(product1.getPresto());
		
		product1.setPrestissimo("178 bpm and aboce");//37
		System.out.println(product1.getPrestissimo());
		
		product1.setAllegrissimo("150-167  bpm");//38
		System.out.println(product1.getAllegrissimo());
		
		product1.setVivace("132-140 bpm");//39
		System.out.println(product1.getVivace());
		
		product1.setModerato("86-97 bpm");//40
		System.out.println(product1.getModerato());
		
		product1.setMarciaModerato("83-85 bpm");//41
		System.out.println(product1.getMarciaModerato());
		
		product1.setRecordStudio("AJ studio");//42
		System.out.println(product1.getRecordStudio());
		
		product3.setAmplitude("loud");//43
		System.out.println(product3.getAmplitude());
		
		product3.setForte("loudness");//44
		System.out.println(product3.getForte());
		
	        product3.setPulse("steady beat");//45
	        System.out.println(product3.getPulse());
		
		product3.setPower(true);//46
		System.out.println(product3.isPower());
		
		product3.setHarmony("chords");//47
		System.out.println(product3.getHarmony());
		
		product3.setLove(true);//48
		System.out.println(product3.isLove());
		
		product3.setPriceOfFlute(5050.0);//49
		System.out.println(product3.getPriceOfFlute());
		
		product3.setNoisy(false);//50
		System.out.println(product3.isNoisy());
		
		product3.setPriceOfClassicalGuitar(12000);//51
		System.out.println(product3.getPriceOfClassicalGuitar());
		
		product3.setPassion(true);//52
		System.out.println(product3.isPassion());
		
		product3.setPriceOfViolin(30000);//53
		System.out.println(product3.getPriceOfViolin());
		
		product3.setSilence(true);//54
		System.out.println(product3.isSilence());
		
		product3.setPriceOfWestguitar(35000);//55
		System.out.println(product3.getPriceOfWestguitar());
		
		product3.setSpecial(true);//56
		System.out.println(product3.isSpecial());
		
		product3.setMeter("fastbeats");//57
		System.out.println(product3.getMeter());
		
		product3.setKannadaMusic("bestMusic");//58
		System.out.println(product3.getKannadaMusic());
		
		product3.setLife(true);//59
		System.out.println(product3.isLife());
		
		product3.setRange("Alto");//60
		System.out.println(product3.getRange());
		
		product3.setSoundIntensity(45);//61
		System.out.println(product3.getSoundIntensity());
		
		product3.setWriter("Ilaiyaraaja");//62
		System.out.println(product3.getWriter());
		
		product.setKaroake("backgroundMusic");//63
		System.out.println(product.getKaroake());
		
		product.setMike("toSing");//64
		System.out.println(product.getMike());
		
		product.setPeace(true);//65
		System.out.println(product.isPeace());
		
		product.setWhite("medium");//66
		System.out.println(product.getWhite());
		
		product.setLoudness("stress");//67
		System.out.println(product.getLoudness());
		
		product.setMelody("soft");//68
		System.out.println(product.getMelody());
		
		product1.setInterval("breakBWSongs");//69
		System.out.println(product1.getInterval());
		
		product1.setShape("layers");//70
		System.out.println(product1.getShape());
		
		product1.setRhythm("meter");//71
		System.out.println(product1.getRhythm());
		
		product1.setExpression("happy");//72
		System.out.println(product1.getExpression());
		
		product2.setDynamic("softer");//73
		System.out.println(product2.getDynamic());
		
		product2.setAllegretto("98 to 109bpm");//74
		System.out.println(product2.getAllegretto());
		
		product3.setRitardando("long");//75
		System.out.println(product3.getRitardando());
		
		product3.setAccelerando("fast");//76
		System.out.println(product3.getAccelerando());
		
		product3.setTypesOfInstruments("classical");//77
		System.out.println(product3.getTypesOfInstruments());
		
		product3.setInsrument("guitar");//78
		System.out.println(product.getInsrument());
		
		product3.setFrequency("50-40hz");//79
		System.out.println(product3.getFrequency());
		
		product3.setSound(true);//80
		System.out.println(product3.isSound());
		
		
		
		
	}

}
