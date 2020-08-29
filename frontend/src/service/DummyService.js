import axios from "axios";
const API_URL = process.env.REACT_APP_APIURL || 'http://localhost:8080/'
const URL = API_URL + "dummy";

export const findAllDummies = () => {
  return axios.get(URL);
};

export const saveDummy = (dummy) => {
  return axios.post(URL, dummy);
};


