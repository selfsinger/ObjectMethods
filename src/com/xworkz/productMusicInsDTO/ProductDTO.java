package com.xworkz.productMusicInsDTO;

public class ProductDTO {
//	ProductDTO : 80 properties
//	1. 4 Rules of DTO 
//	2. Runner create 4 instances and init all properties using setter and print values using getter 
	
	private String types;
	private String singer;
	private String overtone;
	private String writer;
	private String timbre;
	private String pitch;
	private String amplitude;
	private String loudness;
	private String melody;
	private String interval;
	private String shape;
	private String range;
	private String rhythm;
	private String expression;
	private String duration;
	private String homophony;
	private String articulation;
	private String tempo;
	private String dynamic;
	private String beat;
	private String emotionalResponse;
	private String dupleMeters;
	private String piano;
	private String forte;
	private String mezzoPiano;
	private String mezzoForte;
	private String Crescendo;
	private String Decrescendo;
	private String Grave;
	private String Larghissimo;
	private String Lento;
	private String Largo;
	private String Larghetto;
	private String Adagio;
	private String Andante;
	private String marciaModerato;
	private String Moderato;
	private String Allegretto;
	private String Vivace;
	private String Allegrissimo;
	private String Presto;
	private String Prestissimo;
	private String Ritardando;
	private String Accelerando;
	private String majorScale;
	private String minorScale;
	private String majorPentatonic;
	private String minorPentatonic;
	private String meter;
	private String monophony;
	private String polyphony;
	private String karoake;
	private String insrument;
	private String harmony;
	private String frequency;
	private String pulse;
	private String typesOfInstruments;
	private String black;
	private String White;
	private String kannadaMusic;
	private String RecordStudio;
	private String mike;
	private double tripleMeter;
	private double compoundMeter;
	private boolean silence;
	private boolean art;
	private boolean special;
	private boolean peace;
	private boolean noisy;
	private boolean passion;
	private boolean habbit;
	private boolean power;
	private boolean love;
	private boolean life;
	private boolean sound;
	private int soundIntensity;
	private double priceOfClassicalGuitar;
	private double priceOfWestguitar;
	private double priceOfViolin;
	private double priceOfFlute;
	
	public ProductDTO()
	{
		System.out.println("no-arg constructor");
	}
	
	//parameterized const
	public ProductDTO(String types, String singer, String overtone, String writer, String timbre, String pitch,
			String amplitude, String loudness, String melody, String interval, String shape, String range,
			String rhythm, String expression, String duration, String homophony, String articulation, String tempo,
			String dynamic, String beat, String emotionalResponse, String dupleMeters, String piano, String forte,
			String mezzoPiano, String mezzoForte, String crescendo, String decrescendo, String grave,
			String larghissimo, String lento, String largo, String larghetto, String adagio, String andante,
			String marciaModerato, String moderato, String allegretto, String vivace, String allegrissimo,
			String presto, String prestissimo, String ritardando, String accelerando, String majorScale,
			String minorScale, String majorPentatonic, String minorPentatonic, String meter, String monophony,
			String polyphony, String karoake, String insrument, String harmony, String frequency, String pulse,
			String typesOfInstruments, String black, String white, String kannadaMusic, String recordStudio,
			String mike, double tripleMeter, double compoundMeter, boolean silence, boolean art, boolean special,
			boolean peace, boolean noisy, boolean passion, boolean habbit, boolean power, boolean love, boolean life,
			boolean sound, int soundIntensity, double priceOfClassicalGuitar, double priceOfWestguitar,
			double priceOfViolin, double priceOfFlute) {
		super();
		this.types = types;
		this.singer = singer;
		this.overtone = overtone;
		this.writer = writer;
		this.timbre = timbre;
		this.pitch = pitch;
		this.amplitude = amplitude;
		this.loudness = loudness;
		this.melody = melody;
		this.interval = interval;
		this.shape = shape;
		this.range = range;
		this.rhythm = rhythm;
		this.expression = expression;
		this.duration = duration;
		this.homophony = homophony;
		this.articulation = articulation;
		this.tempo = tempo;
		this.dynamic = dynamic;
		this.beat = beat;
		this.emotionalResponse = emotionalResponse;
		this.dupleMeters = dupleMeters;
		this.piano = piano;
		this.forte = forte;
		this.mezzoPiano = mezzoPiano;
		this.mezzoForte = mezzoForte;
		Crescendo = crescendo;
		Decrescendo = decrescendo;
		Grave = grave;
		Larghissimo = larghissimo;
		Lento = lento;
		Largo = largo;
		Larghetto = larghetto;
		Adagio = adagio;
		Andante = andante;
		this.marciaModerato = marciaModerato;
		Moderato = moderato;
		Allegretto = allegretto;
		Vivace = vivace;
		Allegrissimo = allegrissimo;
		Presto = presto;
		Prestissimo = prestissimo;
		Ritardando = ritardando;
		Accelerando = accelerando;
		this.majorScale = majorScale;
		this.minorScale = minorScale;
		this.majorPentatonic = majorPentatonic;
		this.minorPentatonic = minorPentatonic;
		this.meter = meter;
		this.monophony = monophony;
		this.polyphony = polyphony;
		this.karoake = karoake;
		this.insrument = insrument;
		this.harmony = harmony;
		this.frequency = frequency;
		this.pulse = pulse;
		this.typesOfInstruments = typesOfInstruments;
		this.black = black;
		White = white;
		this.kannadaMusic = kannadaMusic;
		RecordStudio = recordStudio;
		this.mike = mike;
		this.tripleMeter = tripleMeter;
		this.compoundMeter = compoundMeter;
		this.silence = silence;
		this.art = art;
		this.special = special;
		this.peace = peace;
		this.noisy = noisy;
		this.passion = passion;
		this.habbit = habbit;
		this.power = power;
		this.love = love;
		this.life = life;
		this.sound = sound;
		this.soundIntensity = soundIntensity;
		this.priceOfClassicalGuitar = priceOfClassicalGuitar;
		this.priceOfWestguitar = priceOfWestguitar;
		this.priceOfViolin = priceOfViolin;
		this.priceOfFlute = priceOfFlute;
	}
	
    //getter and setter methods
	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getOvertone() {
		return overtone;
	}

	public void setOvertone(String overtone) {
		this.overtone = overtone;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTimbre() {
		return timbre;
	}

	public void setTimbre(String timbre) {
		this.timbre = timbre;
	}

	public String getPitch() {
		return pitch;
	}

	public void setPitch(String pitch) {
		this.pitch = pitch;
	}

	public String getAmplitude() {
		return amplitude;
	}

	public void setAmplitude(String amplitude) {
		this.amplitude = amplitude;
	}

	public String getLoudness() {
		return loudness;
	}

	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}

	public String getMelody() {
		return melody;
	}

	public void setMelody(String melody) {
		this.melody = melody;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getRhythm() {
		return rhythm;
	}

	public void setRhythm(String rhythm) {
		this.rhythm = rhythm;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getHomophony() {
		return homophony;
	}

	public void setHomophony(String homophony) {
		this.homophony = homophony;
	}

	public String getArticulation() {
		return articulation;
	}

	public void setArticulation(String articulation) {
		this.articulation = articulation;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getDynamic() {
		return dynamic;
	}

	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}

	public String getBeat() {
		return beat;
	}

	public void setBeat(String beat) {
		this.beat = beat;
	}

	public String getEmotionalResponse() {
		return emotionalResponse;
	}

	public void setEmotionalResponse(String emotionalResponse) {
		this.emotionalResponse = emotionalResponse;
	}

	public String getDupleMeters() {
		return dupleMeters;
	}

	public void setDupleMeters(String dupleMeters) {
		this.dupleMeters = dupleMeters;
	}

	public String getPiano() {
		return piano;
	}

	public void setPiano(String piano) {
		this.piano = piano;
	}

	public String getForte() {
		return forte;
	}

	public void setForte(String forte) {
		this.forte = forte;
	}

	public String getMezzoPiano() {
		return mezzoPiano;
	}

	public void setMezzoPiano(String mezzoPiano) {
		this.mezzoPiano = mezzoPiano;
	}

	public String getMezzoForte() {
		return mezzoForte;
	}

	public void setMezzoForte(String mezzoForte) {
		this.mezzoForte = mezzoForte;
	}

	public String getCrescendo() {
		return Crescendo;
	}

	public void setCrescendo(String crescendo) {
		Crescendo = crescendo;
	}

	public String getDecrescendo() {
		return Decrescendo;
	}

	public void setDecrescendo(String decrescendo) {
		Decrescendo = decrescendo;
	}

	public String getGrave() {
		return Grave;
	}

	public void setGrave(String grave) {
		Grave = grave;
	}

	public String getLarghissimo() {
		return Larghissimo;
	}

	public void setLarghissimo(String larghissimo) {
		Larghissimo = larghissimo;
	}

	public String getLento() {
		return Lento;
	}

	public void setLento(String lento) {
		Lento = lento;
	}

	public String getLargo() {
		return Largo;
	}

	public void setLargo(String largo) {
		Largo = largo;
	}

	public String getLarghetto() {
		return Larghetto;
	}

	public void setLarghetto(String larghetto) {
		Larghetto = larghetto;
	}

	public String getAdagio() {
		return Adagio;
	}

	public void setAdagio(String adagio) {
		Adagio = adagio;
	}

	public String getAndante() {
		return Andante;
	}

	public void setAndante(String andante) {
		Andante = andante;
	}

	public String getMarciaModerato() {
		return marciaModerato;
	}

	public void setMarciaModerato(String marciaModerato) {
		this.marciaModerato = marciaModerato;
	}

	public String getModerato() {
		return Moderato;
	}

	public void setModerato(String moderato) {
		Moderato = moderato;
	}

	public String getAllegretto() {
		return Allegretto;
	}

	public void setAllegretto(String allegretto) {
		Allegretto = allegretto;
	}

	public String getVivace() {
		return Vivace;
	}

	public void setVivace(String vivace) {
		Vivace = vivace;
	}

	public String getAllegrissimo() {
		return Allegrissimo;
	}

	public void setAllegrissimo(String allegrissimo) {
		Allegrissimo = allegrissimo;
	}

	public String getPresto() {
		return Presto;
	}

	public void setPresto(String presto) {
		Presto = presto;
	}

	public String getPrestissimo() {
		return Prestissimo;
	}

	public void setPrestissimo(String prestissimo) {
		Prestissimo = prestissimo;
	}

	public String getRitardando() {
		return Ritardando;
	}

	public void setRitardando(String ritardando) {
		Ritardando = ritardando;
	}

	public String getAccelerando() {
		return Accelerando;
	}

	public void setAccelerando(String accelerando) {
		Accelerando = accelerando;
	}

	public String getMajorScale() {
		return majorScale;
	}

	public void setMajorScale(String majorScale) {
		this.majorScale = majorScale;
	}

	public String getMinorScale() {
		return minorScale;
	}

	public void setMinorScale(String minorScale) {
		this.minorScale = minorScale;
	}

	public String getMajorPentatonic() {
		return majorPentatonic;
	}

	public void setMajorPentatonic(String majorPentatonic) {
		this.majorPentatonic = majorPentatonic;
	}

	public String getMinorPentatonic() {
		return minorPentatonic;
	}

	public void setMinorPentatonic(String minorPentatonic) {
		this.minorPentatonic = minorPentatonic;
	}

	public String getMeter() {
		return meter;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public String getMonophony() {
		return monophony;
	}

	public void setMonophony(String monophony) {
		this.monophony = monophony;
	}

	public String getPolyphony() {
		return polyphony;
	}

	public void setPolyphony(String polyphony) {
		this.polyphony = polyphony;
	}

	public String getKaroake() {
		return karoake;
	}

	public void setKaroake(String karoake) {
		this.karoake = karoake;
	}

	public String getInsrument() {
		return insrument;
	}

	public void setInsrument(String insrument) {
		this.insrument = insrument;
	}

	public String getHarmony() {
		return harmony;
	}

	public void setHarmony(String harmony) {
		this.harmony = harmony;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getTypesOfInstruments() {
		return typesOfInstruments;
	}

	public void setTypesOfInstruments(String typesOfInstruments) {
		this.typesOfInstruments = typesOfInstruments;
	}

	public String getBlack() {
		return black;
	}

	public void setBlack(String black) {
		this.black = black;
	}

	public String getWhite() {
		return White;
	}

	public void setWhite(String white) {
		White = white;
	}

	public String getKannadaMusic() {
		return kannadaMusic;
	}

	public void setKannadaMusic(String kannadaMusic) {
		this.kannadaMusic = kannadaMusic;
	}

	public String getRecordStudio() {
		return RecordStudio;
	}

	public void setRecordStudio(String recordStudio) {
		RecordStudio = recordStudio;
	}

	public String getMike() {
		return mike;
	}

	public void setMike(String mike) {
		this.mike = mike;
	}

	public double getTripleMeter() {
		return tripleMeter;
	}

	public void setTripleMeter(double tripleMeter) {
		this.tripleMeter = tripleMeter;
	}

	public double getCompoundMeter() {
		return compoundMeter;
	}

	public void setCompoundMeter(double compoundMeter) {
		this.compoundMeter = compoundMeter;
	}

	public boolean isSilence() {
		return silence;
	}

	public void setSilence(boolean silence) {
		this.silence = silence;
	}

	public boolean isArt() {
		return art;
	}

	public void setArt(boolean art) {
		this.art = art;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public boolean isPeace() {
		return peace;
	}

	public void setPeace(boolean peace) {
		this.peace = peace;
	}

	public boolean isNoisy() {
		return noisy;
	}

	public void setNoisy(boolean noisy) {
		this.noisy = noisy;
	}

	public boolean isPassion() {
		return passion;
	}

	public void setPassion(boolean passion) {
		this.passion = passion;
	}

	public boolean isHabbit() {
		return habbit;
	}

	public void setHabbit(boolean habbit) {
		this.habbit = habbit;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean isLove() {
		return love;
	}

	public void setLove(boolean love) {
		this.love = love;
	}

	public boolean isLife() {
		return life;
	}

	public void setLife(boolean life) {
		this.life = life;
	}

	public boolean isSound() {
		return sound;
	}

	public void setSound(boolean sound) {
		this.sound = sound;
	}

	public int getSoundIntensity() {
		return soundIntensity;
	}

	public void setSoundIntensity(int soundIntensity) {
		this.soundIntensity = soundIntensity;
	}

	public double getPriceOfClassicalGuitar() {
		return priceOfClassicalGuitar;
	}

	public void setPriceOfClassicalGuitar(double priceOfClassicalGuitar) {
		this.priceOfClassicalGuitar = priceOfClassicalGuitar;
	}

	public double getPriceOfWestguitar() {
		return priceOfWestguitar;
	}

	public void setPriceOfWestguitar(double priceOfWestguitar) {
		this.priceOfWestguitar = priceOfWestguitar;
	}

	public double getPriceOfViolin() {
		return priceOfViolin;
	}

	public void setPriceOfViolin(double priceOfViolin) {
		this.priceOfViolin = priceOfViolin;
	}

	public double getPriceOfFlute() {
		return priceOfFlute;
	}

	public void setPriceOfFlute(double priceOfFlute) {
		this.priceOfFlute = priceOfFlute;
	}
	
	
}