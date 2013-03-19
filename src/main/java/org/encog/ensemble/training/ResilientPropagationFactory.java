package org.encog.ensemble.training;

import org.encog.ensemble.EnsembleTrainFactory;
import org.encog.ml.MLMethod;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.train.MLTrain;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;

public class ResilientPropagationFactory implements EnsembleTrainFactory {

	@Override
	public MLTrain getTraining(MLMethod mlMethod, MLDataSet trainingData) {
		return (MLTrain) new ResilientPropagation((BasicNetwork) mlMethod, trainingData);
	}

	@Override
	public String getLabel() {
		return "resprop";
	}

}
