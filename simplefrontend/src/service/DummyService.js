import axios from "axios";
const URL = process.env.REACT_APP_APIURL + "dummy";

export const findAllDummies = () => {
  return axios.get(URL);
};

export const saveDummy = (dummy) => {
  return axios.post(URL, dummy);
};


